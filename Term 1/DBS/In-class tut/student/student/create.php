<?php require('../config/config.php'); ?>

<!DOCTYPE html>
<html>
	<head>
		<title>Create new student</title>
	</head>
	
	<body>
		<form action="create.php" method="POST">
			<div>
				<label>StudentID</label>
				<input type="text" name="student_id" />
			</div>
			<!-- First name -->
			<div>
				<label>First name</label>
				<input type="text" name="first_name" />
			</div>
			<!-- Last name -->
			<div>
				<label>Last name</label>
				<input type="text" name="last_name" />
			</div>
			
			<!-- Email -->
			<div>
				<label>Email</label>
				<input type="text" name="email" />
			</div>
			
			<!-- DOB -->
			<div>
				<label>DOB</label>
				<input type="date" name="dob" />
			</div>
			
			<button type="submit" name="save">Save</button>
		</form>
		
		<?php 
			//if submit button is clicked
			if (isset($_POST['save'])) {
				$studentId = $_POST['student_id'];
				$firstName = $_POST['first_name'];
				$lastName = $_POST['last_name'];
				$email = $_POST['email'];
				$dob = $_POST['dob'];
				
				$sql = sprintf("INSERT INTO students(student_id, first_name, last_name, email, dob) 
				VALUES ('%s','%s','%s','%s','%s')", $studentId, $firstName, $lastName, $email, $dob );
				
				$result = $conn->query($sql);
				if ($result) {
					header('location:index.php');
				}
			}
			
		?>
	</body>
</html>