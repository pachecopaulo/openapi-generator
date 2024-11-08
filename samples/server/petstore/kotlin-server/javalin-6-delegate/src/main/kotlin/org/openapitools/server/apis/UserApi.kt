package org.openapitools.server.apis

import io.javalin.http.Context
import io.javalin.http.bodyAsClass
import io.javalin.http.pathParamAsClass
import io.javalin.http.queryParamAsClass
import org.openapitools.api.UserApiDelegate
import org.openapitools.server.models.User

interface UserApi {

    fun getDelegate(): UserApiDelegate = object: UserApiDelegate {}

    /**
     * Create user
     * This can only be done by the logged in user.
     * @param user Created user object
     */
    fun createUser(ctx: Context) {
        getDelegate().createUser(ctx, ctx.bodyAsClass<User>())
    }

    /**
     * Creates list of users with given input array
     *
     * @param user List of user object
     */
    fun createUsersWithArrayInput(ctx: Context) {
        getDelegate().createUsersWithArrayInput(ctx, ctx.bodyAsClass<List<User>>())
    }

    /**
     * Creates list of users with given input array
     *
     * @param user List of user object
     */
    fun createUsersWithListInput(ctx: Context) {
        getDelegate().createUsersWithListInput(ctx, ctx.bodyAsClass<List<User>>())
    }

    /**
     * Delete user
     * This can only be done by the logged in user.
     * @param username The name that needs to be deleted
     */
    fun deleteUser(ctx: Context) {
        getDelegate().deleteUser(ctx, ctx.pathParamAsClass<kotlin.String>("username").get())
    }

    /**
     * Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing.
     */
    fun getUserByName(ctx: Context) {
        getDelegate().getUserByName(ctx, ctx.pathParamAsClass<kotlin.String>("username").get())
    }

    /**
     * Logs user into the system
     *
     * @param username The user name for login
     * @param password The password for login in clear text
     */
    fun loginUser(ctx: Context) {
        getDelegate().loginUser(ctx, ctx.queryParamAsClass<kotlin.String>("username").get(), ctx.queryParamAsClass<kotlin.String>("password").get())
    }

    /**
     * Logs out current logged in user session
     *
     */
    fun logoutUser(ctx: Context) {
        getDelegate().logoutUser(ctx)
    }

    /**
     * Updated user
     * This can only be done by the logged in user.
     * @param username name that need to be deleted
     * @param user Updated user object
     */
    fun updateUser(ctx: Context) {
        getDelegate().updateUser(ctx, ctx.pathParamAsClass<kotlin.String>("username").get(), ctx.bodyAsClass<User>())
    }
}
