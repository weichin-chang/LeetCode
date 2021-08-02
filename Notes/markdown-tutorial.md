# Markdown Tutorial

Table of Content
- 文字樣式
    - 文字字體
    - 文字顏色
    - 標題
    - 程式碼
- 分隔線
- 項目符號/編號
- 代辦事項
- 引用區塊
- 文字超連結
- 圖片
- 表格

# 文字樣式
## 文字字體
- 粗體	**我是粗體** 或 __我是粗體__
- 斜體	*我是斜體*
- 粗斜體	***我是粗斜體***
- 刪除線	~~我是刪除線~~
- 底線	<u>我是底線<u>

## 文字顏色
- <font color=#FF0000>紅色</font>	
- <font color=#FF6600>橘色</font>	
- <font color=#800000>酒紅色</font>
- <font color=#FFD700>金色</font>
- <font color=#FFFF00>黃色</font>
- <font color=#00FF00>綠色</font>
- <font color=#008000>墨綠色</font>
- <font color=#00FFFF>青色</font>
- <font color=#0000FF>深藍色</font>
- <font color=#FF00FF>粉紅色</font>
- <font color=#800080>紫色</font>
- <font color=#808080>灰色</font>

## 標題
# 等級一標題
## 等級二標題
### 等級三標題
#### 等級四標題
##### 等級五標題
###### 等級六標題

## 程式碼
支援 highlight 的語言如[網站](https://support.codebasehq.com/articles/tips-tricks/syntax-highlighting-in-markdown)所示。

- 文字間程式碼
    - C語言的輸入請使用 `scanf()` 函式。

- 段落程式碼
    ```c
    // HelloWorld 程式
    int main( )
    {
        printf("HelloWorld\n");
    }
    ```

# 分隔線
一整列中輸入三個以上的 *** 或三個以上的 ---，且整列不能有其它文字，結果顯示如下：

項目符號/編號
項目符號可以用 *、+ 或 -，放在整列的開頭當作項目符號，且符號和文字間要空一格，語法範例如下：

+ aaa
+ bbb
+ ccc
其結果顯示如下：

aaa
bbb
ccc
而編號就是使用數字在加上 .，且 . 和文字間要空一格，語法範例如下：

1. aaa
2. bbb
3. ccc
其結果顯示如下：

aaa
bbb
ccc
若使用「階層式」的項目符號/編號，只要記得空的格數要整齊即可。

+ 益者三友
  + 友直
  + 友諒
  + 友多聞
     + 益矣
+ 損者三友
  + 友便辟
  + 友善柔
  + 友便佞
     + 損矣

# 代辦事項
代辦事項的語法如下，若要在框框中打勾，則需在 [ ] 中輸入 x。

- [ ] 空心菜
- [x] 玉米
- [x] 醬油
- [ ] 豬肉
其結果顯示如下：

 空心菜
 玉米
 醬油
 豬肉
引用區塊
使用 > 放在整列的開頭當作引用區塊，且 > 和文字間要空一格，語法範例如下：

> 人遠比自己想象的要堅強
> 特別是當你回頭看看的時候
> 你會發現自己走了一段自己都沒想到的路
其結果顯示如下：

人遠比自己想象的要堅強
特別是當你回頭看看的時候
你會發現自己走了一段自己都沒想到的路

而”引用”也支援「階層式」顯示：

> 人生就像一杯茶
> > 不會苦一輩子
> > > 但總會苦一陣子
其結果顯示如下：

人生就像一杯茶

不會苦一輩子

但總會苦一陣子

# 文字超連結
- [奇摩首頁](https://tw.yahoo.com/)
- [Google首頁](https://www.google.com/)
- [Facebook](https://www.facebook.com/)

# 圖片
括弧內指的是圖片的"替代文字"，即當圖片連結失效後會顯示的文字。

- ![奇摩首頁Logo](https://s1.yimg.com/rz/d/yahoo_frontpage_zh-Hant-TW_s_f_p_bestfit_frontpage_2x.png)
- ![Google首頁Logo](https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png)
- ![FB Logo](123.png)

# 表格
表格的基本語法如下，第一列是表格的標題列，然後第二列固定要是以 --- 做區隔，加欄位都是使用 | 來添加。注意表格的每欄寬度會自動分配，所以可以忽略一切的空格(也就是每列的 | 沒有對齊也沒關係，且加多少空格也不會影響每欄的寬度)。

| Column 1 | Column 2 | Column 3 |
| -------- | -------- | -------- |
| Text1 | Text2 | Text3 |
| Text4    | Text5    | Text6    |


而每欄可以決定要如何對齊，對齊方式取決於第二列的 ---，再加上 : 符號：

:--- 靠左對齊。
---: 靠右對齊。
:---: 置中對齊。
| 預設對齊 | 靠左對齊 | 靠右對齊 | 置中對齊 |
| ----- | :----- | -----: | :-----: |
| Text1 | Text2 | Text3 | Text4 |
| Text5 | Text6 | Text7 | Text8 |
| Text9 | Text10 | Text11 | Text12 |