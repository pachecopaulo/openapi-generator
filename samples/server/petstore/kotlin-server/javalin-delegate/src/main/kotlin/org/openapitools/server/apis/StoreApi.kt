package org.openapitools.server.apis

import io.javalin.http.Context
import io.javalin.http.bodyAsClass
import io.javalin.http.pathParamAsClass
import org.openapitools.api.StoreApiDelegate
import org.openapitools.server.models.Order

interface StoreApi {

    fun getDelegate(): StoreApiDelegate = object: StoreApiDelegate {}
    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     * @param orderId ID of the order that needs to be deleted
     */
    fun deleteOrder(ctx: Context) {
        getDelegate().deleteOrder(ctx, ctx.pathParamAsClass<kotlin.String>("orderId").get())
    }

    /**
     * Returns store inventories by status
     * Returns a map of status codes to quantities
     */
    fun getInventory(ctx: Context) {
        getDelegate().getInventory(ctx)
    }

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     * @param orderId ID of store that needs to be fetched
     */
    fun getOrderById(ctx: Context) {
        getDelegate().getOrderById(ctx, ctx.pathParamAsClass<kotlin.Long>("orderId").get())
    }

    /**
     * Place an order for a store
     *
     * @param order order placed for purchasing the store
     */
    fun placeOrder(ctx: Context) {
        getDelegate().placeOrder(ctx, ctx.bodyAsClass<Order>())
    }
}
