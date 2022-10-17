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
                    <h2>Add Contact</h2>
                </div>
                <div class="card-body">
                        <form:form id="form" cssClass="text-center" action="${pageContext.request.contextPath}/contacts/add-contact" method="post" modelAttribute="contactDto" >
                            <div class="row text-start">
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="firstName">First name</form:label>
                                        <form:input path="firstName" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="lastName">Last name</form:label>
                                        <form:input path="lastName" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="company">Company</form:label>
                                        <form:input path="company" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="function">Function</form:label>
                                        <form:input path="function" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="email">Email</form:label>
                                        <form:input path="email" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="telephone">Telephone</form:label>
                                        <form:input path="telephone" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="country">Country</form:label>
                                        <form:input path="country" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="adress1">Adress</form:label>
                                        <form:input path="adress1" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="adress2">Address:Line2</form:label>
                                        <form:input path="adress2" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="postalCode">Postal code</form:label>
                                        <form:input path="postalCode" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-12 mb-3">
                                    <div class="form-group">
                                        <form:label path="town">Town</form:label>
                                        <form:input path="town" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-6 mb-3">
                                    <div class="form-group">
                                        <form:label path="relation">Relation</form:label>
                                        <form:input path="relation" cssClass="form-control" ></form:input>
                                    </div>
                                </div>
                                <div class="col-6 mb-3">
                                    <div class="form-group">
                                        <form:label path="contact2Id">With contact</form:label>
                                        <form:select path="contact2Id" items="${contacts}" cssClass="form-control" ></form:select>
                                    </div>
                                </div>
                            </div>
                            <input type="submit" class="btn btn-primary" value="Add Contact">
                        </form:form>
                </div>

            </div>
        </div>

</main>

<c:import url="footer.jsp"></c:import>
