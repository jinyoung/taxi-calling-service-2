
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerManagementCustomerManager from "./components/listers/CustomerManagementCustomerCards"
import CustomerManagementCustomerDetail from "./components/listers/CustomerManagementCustomerDetail"

import TaxiDriverManagementTaxiDriverManager from "./components/listers/TaxiDriverManagementTaxiDriverCards"
import TaxiDriverManagementTaxiDriverDetail from "./components/listers/TaxiDriverManagementTaxiDriverDetail"

import PlatformOperationsPlatformOperatorManager from "./components/listers/PlatformOperationsPlatformOperatorCards"
import PlatformOperationsPlatformOperatorDetail from "./components/listers/PlatformOperationsPlatformOperatorDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customerManagements/customers',
                name: 'CustomerManagementCustomerManager',
                component: CustomerManagementCustomerManager
            },
            {
                path: '/customerManagements/customers/:id',
                name: 'CustomerManagementCustomerDetail',
                component: CustomerManagementCustomerDetail
            },

            {
                path: '/taxiDriverManagements/taxiDrivers',
                name: 'TaxiDriverManagementTaxiDriverManager',
                component: TaxiDriverManagementTaxiDriverManager
            },
            {
                path: '/taxiDriverManagements/taxiDrivers/:id',
                name: 'TaxiDriverManagementTaxiDriverDetail',
                component: TaxiDriverManagementTaxiDriverDetail
            },

            {
                path: '/platformOperations/platformOperators',
                name: 'PlatformOperationsPlatformOperatorManager',
                component: PlatformOperationsPlatformOperatorManager
            },
            {
                path: '/platformOperations/platformOperators/:id',
                name: 'PlatformOperationsPlatformOperatorDetail',
                component: PlatformOperationsPlatformOperatorDetail
            },




    ]
})
