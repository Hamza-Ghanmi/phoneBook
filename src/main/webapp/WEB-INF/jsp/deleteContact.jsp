
<div class="modal fade" id="deleteConfirm${param.contactId}">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h4 class="modal-title">Confirm delete</h4>
            </div>

            <!-- Modal body -->
            <div class="modal-body">
                Are you sure ?
            </div>

            <!-- Modal footer -->
            <div class="modal-footer">
                <form action="${pageContext.request.contextPath}/contacts/delete-contact" method="post">
                    <input hidden name="contactId" value="${param.contactId}">
                    <button type="submit" class="btn btn-danger">Delete</button>
                </form>
            </div>

        </div>
    </div>
</div>