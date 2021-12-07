# Programmers
## oracle
- 상위 n개 레코드
```sql
select name
from animal_ins
where datetime = (select min(datetime) from animal_ins)
```
