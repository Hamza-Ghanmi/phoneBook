<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:import url="header.jsp">
    <c:param name="title" value="Add Contact"></c:param>
</c:import>

<main>
        <div class="container w-50">
            <div class="card mt-3">
                <div class="card-header text-center">
                    <h2>Contact Details</h2>
                </div>
                <div class="card-body">
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">First name : ${contactDto.firstName}</li>
                        <li class="list-group-item">Last name : ${contactDto.lastName}</li>
                        <li class="list-group-item">Company : ${contactDto.company}</li>
                        <li class="list-group-item">Function : ${contactDto.function}</li>
                        <li class="list-group-item">Email : ${contactDto.email}</li>
                        <li class="list-group-item">Telephone : ${contactDto.telephone}</li>
                        <li class="list-group-item">Address : ${contactDto.adress1},
                            ${contactDto.adress2},
                            ${contactDto.postalCode},
                            ${contactDto.town},
                            ${contactDto.country}
                        </li>
                    </ul>
                </div>

            </div>
        </div>

</main>

<c:import url="footer.jsp"></c:import>
