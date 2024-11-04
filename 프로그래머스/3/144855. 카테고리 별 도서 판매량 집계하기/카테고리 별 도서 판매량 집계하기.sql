-- 코드를 입력하세요
SELECT A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK A, BOOK_SALES B
WHERE TO_CHAR(B.SALES_DATE, 'YYYY-MM-DD') LIKE '2022-01%'
AND A.BOOK_ID = B.BOOK_ID
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY ASC;