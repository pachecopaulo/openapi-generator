package org.openapitools.server.apis

import io.javalin.http.Context
import io.javalin.http.bodyAsClass
import io.javalin.http.pathParamAsClass
import io.javalin.http.queryParamAsClass

import org.openapitools.server.models.Order

 /* isDelegate is true */ 

    interface StoreApi {
        fun getDelegate(): StoreApiDelegate = object: StoreApiDelegate {}
        /**
        * Delete purchase order by ID
        * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
        * @param orderId ID of the order that needs to be deleted 
        */
        fun deleteOrder(ctx: Context) {
            return getDelegate().deleteOrder(ctx: Context, orderId);
        }

        /**
        * Returns pet inventories by status
        * Returns a map of status codes to quantities
        */
        fun getInventory(ctx: Context) {
            return getDelegate().getInventory(ctx: Context, );
        }

        /**
        * Find purchase order by ID
        * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
        * @param orderId ID of pet that needs to be fetched 
        */
        fun getOrderById(ctx: Context) {
            return getDelegate().getOrderById(ctx: Context, orderId);
        }

        /**
        * Place an order for a pet
        * 
        * @param order order placed for purchasing the pet 
        */
        fun placeOrder(ctx: Context) {
            return getDelegate().placeOrder(ctx: Context, order);
        }

    }
