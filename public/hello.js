/**
 * Created by green on 28.08.15.
 */

function Hello($scope, $http){

    $http.get('greeting', {data: {name: name}}).
        success(function(data) {
        $scope.greeting = data;
    });

    $scope.update = function() {
        $http.get('greeting', {params: {name: $scope.name}})
        success(function(data) {
            $scope.greeting = data;
        });
    }
}
