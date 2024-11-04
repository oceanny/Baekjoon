-- 코드를 입력하세요
SELECT NAME, CNT AS COUNT
FROM (SELECT NAME, COUNT(*) AS CNT
        FROM ANIMAL_INS
       WHERE NAME IS NOT NULL
      GROUP BY NAME)
WHERE CNT > 1
ORDER BY NAME;