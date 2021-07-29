var app = angular.module('computer shop', []);


app.constant('user_table', [
    {
        user_id: 1,
        user_name: "Mr. Employee",
        user_email: "employee@mail.com",
        user_role: "Employee",
        password: "123456"
    },
    {
        user_id: 2,
        user_name: "Ms. Accountant",
        user_email: "accountant@mail.com",
        user_role: "Accountant",
        password: "123456"
    },
    {
        user_id: 3,
        user_name: "Mr. Customer",
        user_email: "customer@mail.com",
        user_role: "Customer",
        password: "123456"
    }
]);


app.factory('computer_table', function () {
    var computer_table = {
        computers: [
            {
                computer_id: 1,
                computer_name: "Laptop Dell Inspiron 3567 i3 6006U/4GB/1TB/Win10/",
                computer_colour: "black",
                computer_price: 50,
                computer_rating: 5,
                quantity: 2
            },
            {
                computer_id: 2,
                computer_name: "Laptop Dell Vostro 3468 i5 7200U/4GB/1TB/Win10",
                computer_colour: "white",
                computer_price: 45,
                computer_rating: 4,
                quantity: 1
            }
        ]
    };
    return computer_table;
});


app.factory('rating_table', function () {
    return [
        {
            computer_id: 1,
            user_id: 3,
            user_rating: 5,
            review_content: "Very Good!"
        },
        {
            computer_id: 2,
            user_id: 3,
            user_rating: 4,
            review_content: "Pretty Good!"
        }
    ]
});


app.factory('user', ['user_table', '$window',
    function (user_table, $window) {
        var user = {
            user_email: "",
            password: ""
        };

		
        user.isEmployee = function () {
            var token = user.getToken();
            if (token) {
                return token.user_role === "Employee" || token.user_role === "Accountant";
            }
            return false;
        };
        
		
        user.isAccountant = function () {
            var token = user.getToken();
            if (token) {
                return token.user_role === "Accountant";
            }
            return false;
        };
        
		
        user.currentUser = function () {
            var token = user.getToken();
            if (token) {
                if (token.user_name) {
                    return token.user_name;
                }
                return "Guest";
            } else {
                return "Guest";
            }            
        };

		
        user.register = function () {
            // Prototype, no register function
        };

        user.isLoggedIn = function () {
            var token = user.getToken();
            return !!token;
        };

		
        user.logIn = function () {
            var i;
            var u = user_table;
            for (i = 0; i < u.length; i++) {
                if (user.user_email === u[i].user_email && user.password === u[i].password) {
                    user.saveToken(JSON.stringify(u[i]));
                    return true;
                }
            }
            return false;
        };

		
        user.logOut = function () {
            $window.localStorage.removeItem('computerstore-token');
        };

		
        user.saveToken = function (token) {
            $window.localStorage['computerstore-token'] = token;
        };

		
        user.getToken = function () {
            var token = $window.localStorage['computerstore-token'];
            if (token) {
                return JSON.parse(token);
            } else {
                return null;
            }            
        };

        return user;
    }]);

	
app.factory('computer', ['computer_table',
    function (computer_table) {
        var computer = {};

        computer.add = function () {
            var newComputer = {
                computer_id: computer.computer_id,
                computer_name: computer.computer_name,
                computer_colour: computer.computer_colour,
                computer_price: computer.computer_price,
                quantity: computer.quantity
            };
            computer_table.computers.push(newcomputer);
        };
        
		
        computer.delete = function () {
            var deletecomputer = {
                computer_id: computer.computer_id,
                computer_name: computer.computer_name,
                computer_colour: computer.computer_colour,
                computer_price: computer.computer_price,
                quantity: computer.quantity
            };
            var index = computer_table.computers.indexOf(deletecomputer);
            if (index > -1) {
                array.splice(index, 1);
            }
        };

        computer.getAll = function () {
            return computer_table.computers;
        };
        
        return computer;
    }]);

	
app.controller('MainController', [
    '$scope',
    'user',
    '$window',
    function ($scope, user, $window) {
        $scope.userName = user.currentUser;
        $scope.logOut = function () {
            user.logOut();
            $window.location.href = 'homepage.html';
        };
        $scope.isLoggedIn = user.isLoggedIn;
        $scope.isEmployee = user.isEmployee;
        $scope.isAccountant = user.isAccountant;
    }
]);


app.controller('AuthenticationController', [
    '$scope',
    'user',
    '$window',
    function ($scope, user, $window) {
        $scope.logIn = function () {
            user.user_email = $scope.email;
            user.password = $scope.pwd;
            if (user.logIn()) {
                swal({
                    title: "Sign-in success",
                    type: "success"
                }).then(function () {
                    $window.location.href = 'homepage.html';
                });                
            } else {
                swal({
                    title: "Sign-in failed",
                    type: "error"
                })
            }
        };

		
        $scope.notImplemented = function () {
            swal({
                title: "This function is not implemented in prototype",
                type: "warning"
            })
        };
    }
]);


app.controller('computersController', [
    '$scope',
    'computer',
    function ($scope, computer) {
        $scope.computers = computer.getAll();
        $scope.notImplemented = function () {
            swal({
                title: "This function is not implemented in prototype",
                type: "warning"
            })
        };
        $scope.addcomputer = function () {
            computer.computer_id = computer.getAll().length + 1;
            computer.computer_name = $scope.name;
            computer.computer_colour = $scope.colour;
            computer.computer_price = $scope.price;
            computer.quantity = $scope.quantity;
            computer.add();
            swal({
                    title: "Add computer successful",
                    type: "success"
                })
        }        
    }
]);


app.controller('OrdersController', [
    '$scope',
    function ($scope) {
        $scope.notImplemented = function () {
            swal({
                title: "This function is not implemented in prototype",
                type: "warning"
            })
        };
    }
]);