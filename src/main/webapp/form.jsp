<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Food Form</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container">
       <h2>Food Form</h2>
       <form method="post" action="/create">
           <div class="form-group">
               <label>Name:</label>
               <input type="text" name="name" class="form-control">
           </div>
           <div class="form-group">
               <label>Category:</label>
               <select class="form-control" name="category">
                   <option value="">----Choose category----</option>
                   <option value="1">Món nướng</option>
                   <option value="2">Món luộc</option>
                   <option value="3">Món chay</option>
                   <option value="4">Đồ uống</option>
               </select>
           </div>
           <div class="form-group">
               <label>Description:</label>
               <textarea class="form-control" name="description"></textarea>
           </div>
           <div class="form-group">
               <label>Thumbnail:</label>
               <input type="text" class="form-control" name="thumbnail">
           </div>
           <div class="form-group">
               <label>Price:</label>
               <input type="number" class="form-control" name="price">
           </div>
           <div class="form-group">
                <button class="btn btn-success">Submit</button>
                <button class="btn btn-primary">Back</button>
           </div>
       </form>
   </div>
</body>
</html>
