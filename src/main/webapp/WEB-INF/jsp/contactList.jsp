<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="header.jsp">
    <c:param name="title" value="Contact List"></c:param>
</c:import>

<main>
    <div class="container w-50">
        <div class="card mt-3">
            <div class="card-header text-center">
                <h2>Contact List</h2>
            </div>
            <div class="card-body">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>First name</th>
                        <th>Last name</th>
                        <th>Email</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${contactDtos}" var="contactDto">
                        <tr>
                            <td>${contactDto.firstName}</td>
                            <td>${contactDto.lastName}</td>
                            <td>${contactDto.email}</td>
                            <td>
                                <div class="btn-group btn-group-lg">
                                    <a href="${pageContext.request.contextPath}/contacts/details/${contactDto.id}" class="btn btn-primary">Details</a>
                                    <a href="${pageContext.request.contextPath}/contacts/edit-contact/${contactDto.id}" class="btn btn-primary">Edit</a>
                                    <button type="button" class="btn btn-primary">Delete</button>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>
    </div>

</main>

<c:import url="footer.jsp"></c:import>
