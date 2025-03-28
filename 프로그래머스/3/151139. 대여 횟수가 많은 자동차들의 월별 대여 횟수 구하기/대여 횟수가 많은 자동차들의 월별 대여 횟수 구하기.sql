-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(START_DATE, 'MM')) AS MONTH,
         CAR_ID,
         COUNT(*) AS RECORDS
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
   WHERE START_DATE BETWEEN TO_DATE('20220801', 'YYYYMMDD')
                        AND TO_DATE('20221031', 'YYYYMMDD')
GROUP BY TO_NUMBER(TO_CHAR(START_DATE, 'MM')), CAR_ID
  HAVING CAR_ID IN (SELECT CAR_ID
                      FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                     WHERE START_DATE BETWEEN TO_DATE('20220801', 'YYYYMMDD') AND TO_DATE('20221031', 'YYYYMMDD')
                  GROUP BY CAR_ID HAVING COUNT(*) >= 5
                    )
ORDER BY 1 ASC, 2 DESC;