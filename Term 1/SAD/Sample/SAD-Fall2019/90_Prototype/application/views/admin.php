<html>
<?php
// if (isset($this->session->userdata['logged_in'])) {
$username = ($this->session->userdata['username']);
// $email = ($this->session->userdata['email']);
$id = ($this->session->userdata['id']);
// $type = ($this->session->userdata['type']);
// } else {
// header("location: login");
// }
?>
<head>
<title>Admin Page</title>
</head>
<body>
<div id="profile">
<?php
echo "Hello <b id='welcome'><i>" .$username. "</i> !</b>";
echo "<br/>";
echo "<br/>";

echo "Welcome to Admin Page";
echo "<br/>";
echo "<br/>";
echo "Your Username is " . $username;
echo "<br/>";
// echo "Your Email is " . $email;
// echo "<br/>";
echo "Your ID is " . $id;
echo "<br/>";
?>
<b id="logout"><a href="logout">Logout</a></b>
</div>
<br/>
</body>
</html>