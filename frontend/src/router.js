
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import CafeOrderManager from "./components/listers/CafeOrderCards"
import CafeOrderDetail from "./components/listers/CafeOrderDetail"

import MenuManager from "./components/listers/MenuCards"
import MenuDetail from "./components/listers/MenuDetail"

import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import OrderListView from "./components/OrderListView"
import OrderListViewDetail from "./components/OrderListViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/cafeOrders',
                name: 'CafeOrderManager',
                component: CafeOrderManager
            },
            {
                path: '/cafeOrders/:id',
                name: 'CafeOrderDetail',
                component: CafeOrderDetail
            },

            {
                path: '/menus',
                name: 'MenuManager',
                component: MenuManager
            },
            {
                path: '/menus/:id',
                name: 'MenuDetail',
                component: MenuDetail
            },

            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/orderLists',
                name: 'OrderListView',
                component: OrderListView
            },
            {
                path: '/orderLists/:id',
                name: 'OrderListViewDetail',
                component: OrderListViewDetail
            },


    ]
})
