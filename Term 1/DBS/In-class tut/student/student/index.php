<?php require('../config/config.php'); ?>

<!DOCTYPE html>
<html>
	<head>
		<title>Students</title>
	</head>
	
	<body>
		<a href="create.php">Create new student</a>
		<!-- Todo: Create table in html -->
		<table border="1" style="border-collapse:collapse">
			<thead>
				<tr>
					<th>StudentID</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Email</th>
					<th>Dob</th>
				</tr>
			</thead>
			
			<tbody>
				<?php 
					$sql = "SELECT * FROM students";
					$result = $conn->query($sql);
					if ($result->num_rows > 0) {
					  // output data of each row
					  while($row = $result->fetch_assoc()) { ?>
					<tr>
						<td><?php echo $row['student_id']?></td>
						<td><?php echo $row['first_name']?></td>
						<td><?php echo $row['last_name']?></td>
						<td><?php echo $row['email']?></td>
						<td><?php echo $row['dob']?></td>
					</tr>
			    <?php }
					} else {
					  echo "0 results";
					}
					$conn->close();
				?>
			</tbody>
		</table>
	</body>
</html>