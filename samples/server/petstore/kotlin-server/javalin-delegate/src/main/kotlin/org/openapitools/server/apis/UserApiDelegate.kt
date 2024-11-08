package org.openapitools.api

import io.javalin.http.Context
import io.javalin.http.HttpStatus
import org.openapitools.server.models.User

/**
 * A delegate to be called by the {@link UserApiController}}.
 */
interface UserApiDelegate {

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param user Created user object (required)
     * @param ctx The Javalin context. Especially handy if you need to access things like authentication headers in your service. (required)
     * @return successful operation (status code 200)
     * @see UserApi#createUser
     */
    fun createUser(ctx: Context, user: User) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * POST /user/createWithArray : Creates list of users with given input array
     *
     *
     * @param user List of user object (required)
     * @param ctx The Javalin context. Especially handy if you need to access things like authentication headers in your service. (required)
     * @return successful operation (status code 200)
     * @see UserApi#createUsersWithArrayInput
     */
    fun createUsersWithArrayInput(ctx: Context, user: kotlin.collections.List<User>) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * POST /user/createWithList : Creates list of users with given input array
     *
     *
     * @param user List of user object (required)
     * @param ctx The Javalin context. Especially handy if you need to access things like authentication headers in your service. (required)
     * @return successful operation (status code 200)
     * @see UserApi#createUsersWithListInput
     */
    fun createUsersWithListInput(ctx: Context, user: kotlin.collections.List<User>) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @param ctx The Javalin context. Especially handy if you need to access things like authentication headers in your service. (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     * @see UserApi#deleteUser
     */
    fun deleteUser(ctx: Context, username: kotlin.String) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * GET /user/{username} : Get user by user name
     *
     *
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @param ctx The Javalin context. Especially handy if you need to access things like authentication headers in your service. (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     * @see UserApi#getUserByName
     */
    fun getUserByName(ctx: Context, username: kotlin.String) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * GET /user/login : Logs user into the system
     *
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @param ctx The Javalin context. Especially handy if you need to access things like authentication headers in your service. (required)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     * @see UserApi#loginUser
     */
    fun loginUser(ctx: Context, username: kotlin.String, password: kotlin.String) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * GET /user/logout : Logs out current logged in user session
     *
     *
     * @param ctx The Javalin context. Especially handy if you need to access things like authentication headers in your service. (required)
     * @return successful operation (status code 200)
     * @see UserApi#logoutUser
     */
    fun logoutUser(ctx: Context) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }

    /**
     * PUT /user/{username} : Updated user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param user Updated user object (required)
     * @param ctx The Javalin context. Especially handy if you need to access things like authentication headers in your service. (required)
     * @return Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     * @see UserApi#updateUser
     */
    fun updateUser(ctx: Context, username: kotlin.String, user: User) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }
}
