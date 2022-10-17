<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${param.title}</title>
    <!-- CSS only -->
    <link href="../../static/css/style.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/c3ad895569.js" crossorigin="anonymous"></script>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#"><i class="fa-solid fa-address-book"></i></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="mynavbar">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item" style="margin-top:-12px;">
                        <a class="nav-link" href="${pageContext.request.contextPath}/contacts/all-contacts">All contacts</a>
                    </li>
                    <li class="nav-item" style="margin-top:-12px;">
                        <a class="nav-link" href="${pageContext.request.contextPath}/contacts/add-contact">Add Contact</a>
                    </li>
                </ul>
                <form class="d-flex" action="${pageContext.request.contextPath}/contacts/searchResults" method="post">
                    <input class="form-control me-2" type="text" placeholder="Search" name="name">
                    <button class="btn btn-primary" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</header>
