angular
    .module('financeApp')
    .controller('financeController', function ($scope, financeService) {

        this.loadData = function () {
            financeService.getLancamentos().then(function (response) {
                $scope.lancamentos = response.data.listaControleLancamento;
            });
        };

        this.loadData();
    });