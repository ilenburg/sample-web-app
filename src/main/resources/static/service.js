angular
    .module('financeApp')
    .service('financeService', function ($http) {

        var urlBase = 'http://localhost:8080/lancamentos/'

        this.getLancamentos = function (codigoIdentificadorUnico) {
            var url = codigoIdentificadorUnico ? urlBase + codigoIdentificadorUnico : urlBase;
            return $http.get(url);
        };

    });