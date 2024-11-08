package org.openapitools.api

import io.javalin.http.Context
import io.javalin.http.HttpStatus
import org.openapitools.server.models.Order

/**
 * A delegate to be called by the {@link StoreApiController}}.
 */
interface StoreApiDelegate {
    /**
     * @see StoreApi#deleteOrder
     */
    fun deleteOrder(ctx: Context, orderId: kotlin.String) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see StoreApi#getInventory
     */
    fun getInventory(ctx: Context) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)

    }


    /**
     * @see StoreApi#getOrderById
     */
    fun getOrderById(ctx: Context, orderId: kotlin.Long) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see StoreApi#placeOrder
     */
    fun placeOrder(ctx: Context, order: Order) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }
}
