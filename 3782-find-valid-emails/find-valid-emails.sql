SELECT user_id, email
FROM Users
WHERE email LIKE '%.com' 
AND email REGEXP '^[a-zA-Z0-9_]+@[a-zA-Z]+\\.com$'
ORDER BY user_id;