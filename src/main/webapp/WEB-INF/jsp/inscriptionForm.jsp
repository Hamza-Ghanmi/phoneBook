<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:import url="header.jsp">
  <c:param name="title" value="Inscription"></c:param>
</c:import>

<main>
  <div class="container w-50">
    <div class="card mt-3">
      <div class="card-header text-center">
        <h2>Inscription</h2>
      </div>
      <div class="card-body">
        <form:form id="form" cssClass="text-center" action="${pageContext.request.contextPath}/users/sign-in" method="post" modelAttribute="userDto" >
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
                <form:label path="email">Email</form:label>
                <form:input path="email" cssClass="form-control" ></form:input>
              </div>
            </div>
            <div class="col-12 mb-3">
              <div class="form-group">
                <form:label path="pictureUrl">Picture</form:label>
                <form:input path="pictureUrl" cssClass="form-control" ></form:input>
              </div>
            </div>
            <div class="col-12 mb-3">
              <div class="form-group">
                <form:label path="password">Password</form:label>
                <form:password path="password" cssClass="form-control" ></form:password>
              </div>
            </div>
          </div>
          <input type="submit" class="btn btn-primary" value="Sign in">
        </form:form>
      </div>

    </div>
  </div>

</main>

<c:import url="footer.jsp"></c:import>
