-- 코드를 입력하세요
SELECT MCDP_CD AS 진료과코드,
       COUNT(*) AS "5월예약건수"
FROM APPOINTMENT
WHERE APNT_YMD BETWEEN TO_DATE('20220501', 'YYYYMMDD')
                   AND TO_DATE('20220531235959', 'YYYYMMDDHH24MISS')
GROUP BY MCDP_CD
ORDER BY 2, 1;