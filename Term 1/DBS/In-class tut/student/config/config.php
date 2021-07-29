<?php 

$host = "localhost";
$username = "root";
$password = "";
$database = "student";

// Create connection
$conn = new mysqli($host, $username, $password, $database);

// Check connection
if (!$conn) {
  die("Connection failed: " . mysqli_connect_error()); //stop execution, rest of the code will not be executed
}