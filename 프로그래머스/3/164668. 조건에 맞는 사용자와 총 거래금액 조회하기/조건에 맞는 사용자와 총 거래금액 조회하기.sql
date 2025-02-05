-- 코드를 입력하세요
SELECT USER_ID, NICKNAME, SUM(PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD A, USED_GOODS_USER B
WHERE A.WRITER_ID = B.USER_ID
  AND A.STATUS = 'DONE'
GROUP BY USER_ID, NICKNAME HAVING SUM(PRICE) >= 700000
ORDER BY 3 ASC;