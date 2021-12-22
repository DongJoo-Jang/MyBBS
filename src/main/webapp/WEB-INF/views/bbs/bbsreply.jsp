<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
	<div class="modal fade" id="reply" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">답글 작성</h4>
				</div>
				<form action="" method="post" id="frmReply" class="form-margin">
					<div class="modal-body">

						<div class="form-group">
							<label>작성자</label>
							<p>${sessionScope.userid }</p>
						</div>

						<div class="form-group">
							<label>제목</label> <input type="text" class="form-control"
								id="title" name="title">
						</div>

						<div class="form-group">
							<label>내용</label>
							<textarea rows="5" class="form-control" id="content"
								name="content"></textarea>
						</div>

					</div>
					<div class="modal-footer">
						<input type="hidden" name="seq" value="${avo.seq }"> <input
							type="button" class="btn btn-success" value="답글작성"
							onclick='replyValue()'> <input type="reset"
							class="btn btn-success" value="초기화">
						<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
					</div>
				</form>
			</div>

		</div>
	</div>
</html>