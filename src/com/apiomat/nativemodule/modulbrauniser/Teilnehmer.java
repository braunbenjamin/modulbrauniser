/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.modulbrauniser;


import com.apiomat.nativemodule.basics.*;
/**
* Generated default class representing a user in your app
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "ModulBraunIser",
    hooksClassNameTransient = "com.apiomat.nativemodule.modulbrauniser.TeilnehmerHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.modulbrauniser.TeilnehmerHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.Guest, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class Teilnehmer extends com.apiomat.nativemodule.basics.User
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "ModulBraunIser";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Teilnehmer";

    /** class specific attributes */
    private String companyName = null;
    @com.apiomat.nativemodule.StaticData( type = com.apiomat.nativemodule.StaticData.Type.Image )
    private String profilePicURL;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Teilnehmer ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public String getCompanyName()
    {
         return this.companyName;
    }

    public void setCompanyName( String arg )
    {
        this.companyName = arg;
    }

    public String getProfilePicURL( )
    {
        return this.profilePicURL;
    }

    public byte[] loadProfilePic( )
    {
        final String resUrl = getProfilePicURL();
        return getData( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public java.io.InputStream loadProfilePicAsStream( )
    {
        final String resUrl = getProfilePicURL();
        return getDataAsStream( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public String getProfilePicURL( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final java.lang.StringBuilder additionalParameters = new java.lang.StringBuilder();
        additionalParameters.append( ".img?apiKey=" );
        additionalParameters.append( apiKey );
        additionalParameters.append( "&system=" );
        additionalParameters.append( system );
        additionalParameters.append( "&width=" );
        additionalParameters.append( width );
        additionalParameters.append( "&height=" );
        additionalParameters.append( height );
        
        if(backgroundColorAsHex != null) 
        {
            additionalParameters.append( "&bgcolor=" );
            additionalParameters.append( backgroundColorAsHex );
        }
        if(alpha != null)
        {
            additionalParameters.append( "&alpha=" );
            additionalParameters.append( alpha );
        }
        if(format != null)
        {
            additionalParameters.append( "&format=" );
            additionalParameters.append( format );
        }
        return getProfilePicURL( ) + additionalParameters;
    }

    public byte[] loadProfilePic( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final String resUrl = getProfilePicURL( apiKey, system, width, height, 
            backgroundColorAsHex, alpha, format );
        return loadResource(resUrl);
    }

    public void setProfilePicURL( String url ) 
    {
        this.profilePicURL = url;
    }

    /**
     * @deprecated Use {@link #postProfilePic( java.io.InputStream data , String fileName, String format )}
     */
    @Deprecated
    public String postProfilePic( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setProfilePicURL( url );
        return url;
    }

    public String postProfilePic( java.io.InputStream data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setProfilePicURL( url );
        return url;
    }

}
