<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
    <link type="text/css" rel="stylesheet" href="${staticDomainUrl}/public/css/public.css">
</head>
<body>

<#list users as user>
    <h2>${user.id} ----- ${user.name}</h2>
</#list>
</body>
</html>