package org.openapitools.server.apis

import io.javalin.http.Context
import io.javalin.http.bodyAsClass
import io.javalin.http.pathParamAsClass
import io.javalin.http.queryParamAsClass

import org.openapitools.server.models.User

    interface UserApi {
        fun getDelegate(): UserApiDelegate = object: UserApiDelegate {}
        /**
        * Create user
        * This can only be done by the logged in user.
        * @param user Created user object 
        */
        fun createUser(ctx: Context) {
            return getDelegate().createUser(ctx: Context, user);
        }

        /**
        * Creates list of users with given input array
        * 
        * @param user List of user object 
        */
        fun createUsersWithArrayInput(ctx: Context) {
            return getDelegate().createUsersWithArrayInput(ctx: Context, user);
        }

        /**
        * Creates list of users with given input array
        * 
        * @param user List of user object 
        */
        fun createUsersWithListInput(ctx: Context) {
            return getDelegate().createUsersWithListInput(ctx: Context, user);
        }

        /**
        * Delete user
        * This can only be done by the logged in user.
        * @param username The name that needs to be deleted 
        */
        fun deleteUser(ctx: Context) {
            return getDelegate().deleteUser(ctx: Context, username);
        }

        /**
        * Get user by user name
        * 
        * @param username The name that needs to be fetched. Use user1 for testing. 
        */
        fun getUserByName(ctx: Context) {
            return getDelegate().getUserByName(ctx: Context, username);
        }

        /**
        * Logs user into the system
        * 
        * @param username The user name for login 
        * @param password The password for login in clear text 
        */
        fun loginUser(ctx: Context) {
            return getDelegate().loginUser(ctx: Context, usernamepassword);
        }

        /**
        * Logs out current logged in user session
        * 
        */
        fun logoutUser(ctx: Context) {
            return getDelegate().logoutUser(ctx: Context, );
        }

        /**
        * Updated user
        * This can only be done by the logged in user.
        * @param username name that need to be deleted 
        * @param user Updated user object 
        */
        fun updateUser(ctx: Context) {
            return getDelegate().updateUser(ctx: Context, usernameuser);
        }

    }
