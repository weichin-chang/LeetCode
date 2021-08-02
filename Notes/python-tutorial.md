# Python Tutorial

1. 用 next 搭配 generator comprehension 來獲取第一個滿足條件的元素，

像是 next(ele for ele in arr if ele > 0)，就可以拿到 arr 中的第一個正數。


2. 解對稱性題目時，可以把引數調換 call 一次，減少重複的 code，像是：

def foo(a, b):
    if a > b: return foo(b, a)
    ...

就可以讓你接下來維持在 a <= b 的前提下繼續寫 code，或者直接 swap 引數也可以：

def foo(a, b):
    if a > b: a, b = b, a
    ...


3. python dict 可以使用 tuple 作 multikey，像是 d[k1, k2, k3]，

如此一來就不用巢狀 dict 了（d[k1][k2][k3]）


4. 可以使用 unpacking 來抽取出需要的參數，像是：

A = [1, 2, 3, 4, 5]

foo, *B, bar = A

可以得到 foo == 1, B == [2, 3, 4], bar == 5

另外還可以用巢狀 unpacking，

像是 for i, (a, b) in enumerate(pairs): 就超級常用。


5. Python 3.8 跟 3.9 有多了一些不錯的東西，

像是 3.8 的 assignment expression(:=) 跟 3.9 的 dict shallow merge(|)

都有機會可以讓 code 更精簡。


6. 有些 matrix 或是 grid 的題目，兩個 dimension 長度有可能為 0，

可以用 if not any(matrix): return xxx 來處理（感謝 Stefan Pochmann）


7. in 也會消費 iterator，

所以如果想知道某個 str s2 是不是另一個 str s1 的 subsequence 可以這麼做，

I = iter(s1)
return all(c in I for c in s2)

（再次感謝 Stefan Pochmann）


8. 想要測兩個數是不是同正負可以用 (a > 0) is (b > 0)，記得事先檢查 0

板友提供 (credit to @pig2014)： a ^ b > 0 更好


9. 想要攤平巢狀 list 可以用 sum(L, []) <- 不建議！途中 list 會一直重新 alloc

(credit to @coquelicot)

參考 stack overflow：https://bit.ly/3rz8UqH

建議的替代：

9.1. list comprehension: A = [ele for sub in arr for ele in sub]

9.2. itertools: A = list(itertools.chain.from_iterable(arr))

9.3. reduce: A = functools.reduce(operator.iconcat, arr, [])


10. 某些要提供 factory function 的地方，可以遞迴給自己，像是：

trie = lambda: collections.defaultdict(trie)


11. itemgetter 在某些需要 key 的 builtin function 很好用，像是：

sorted(A, key=itemgetter(1))，等同於寫 key=lambda x: x[1]


12. 因為 Python list 提供 negative indexing，

在某些情況可以用 ~i 來獲得對應於 i 的反向 indexing，像是：

for i in range(len(A)):
    A[i] += xxx  # A[0],  A[1],  A[2] , ...
    A[~i] += ooo # A[-1], A[-2], A[-3], ...