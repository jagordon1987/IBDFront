"use strict";
(function () {

    var app = angular.module("app", ["ui.router"]).run(
        function ($log) {
            $log.info("application instantiated")
    });

}());
