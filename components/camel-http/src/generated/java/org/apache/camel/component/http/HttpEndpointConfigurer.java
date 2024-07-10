/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.http;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class HttpEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        HttpEndpoint target = (HttpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authdomain":
        case "authDomain": target.setAuthDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "authhost":
        case "authHost": target.setAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        case "authmethod":
        case "authMethod": target.setAuthMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "authmethodpriority":
        case "authMethodPriority": target.setAuthMethodPriority(property(camelContext, java.lang.String.class, value)); return true;
        case "authpassword":
        case "authPassword": target.setAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "authusername":
        case "authUsername": target.setAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "authenticationpreemptive":
        case "authenticationPreemptive": target.setAuthenticationPreemptive(property(camelContext, boolean.class, value)); return true;
        case "bridgeendpoint":
        case "bridgeEndpoint": target.setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "clearexpiredcookies":
        case "clearExpiredCookies": target.setClearExpiredCookies(property(camelContext, boolean.class, value)); return true;
        case "clientbuilder":
        case "clientBuilder": target.setClientBuilder(property(camelContext, org.apache.hc.client5.http.impl.classic.HttpClientBuilder.class, value)); return true;
        case "clientconnectionmanager":
        case "clientConnectionManager": target.setClientConnectionManager(property(camelContext, org.apache.hc.client5.http.io.HttpClientConnectionManager.class, value)); return true;
        case "connectionclose":
        case "connectionClose": target.setConnectionClose(property(camelContext, boolean.class, value)); return true;
        case "connectionsperroute":
        case "connectionsPerRoute": target.setConnectionsPerRoute(property(camelContext, int.class, value)); return true;
        case "cookiehandler":
        case "cookieHandler": target.setCookieHandler(property(camelContext, org.apache.camel.http.base.cookie.CookieHandler.class, value)); return true;
        case "cookiestore":
        case "cookieStore": target.setCookieStore(property(camelContext, org.apache.hc.client5.http.cookie.CookieStore.class, value)); return true;
        case "copyheaders":
        case "copyHeaders": target.setCopyHeaders(property(camelContext, boolean.class, value)); return true;
        case "customhostheader":
        case "customHostHeader": target.setCustomHostHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "deletewithbody":
        case "deleteWithBody": target.setDeleteWithBody(property(camelContext, boolean.class, value)); return true;
        case "disablestreamcache":
        case "disableStreamCache": target.setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "followredirects":
        case "followRedirects": target.setFollowRedirects(property(camelContext, boolean.class, value)); return true;
        case "getwithbody":
        case "getWithBody": target.setGetWithBody(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "httpclient":
        case "httpClient": target.setHttpClient(property(camelContext, org.apache.hc.client5.http.classic.HttpClient.class, value)); return true;
        case "httpclientconfigurer":
        case "httpClientConfigurer": target.setHttpClientConfigurer(property(camelContext, org.apache.camel.component.http.HttpClientConfigurer.class, value)); return true;
        case "httpclientoptions":
        case "httpClientOptions": target.setHttpClientOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "httpconnectionoptions":
        case "httpConnectionOptions": target.setHttpConnectionOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "httpcontext":
        case "httpContext": target.setHttpContext(property(camelContext, org.apache.hc.core5.http.protocol.HttpContext.class, value)); return true;
        case "httpmethod":
        case "httpMethod": target.setHttpMethod(property(camelContext, org.apache.camel.http.common.HttpMethods.class, value)); return true;
        case "ignoreresponsebody":
        case "ignoreResponseBody": target.setIgnoreResponseBody(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxtotalconnections":
        case "maxTotalConnections": target.setMaxTotalConnections(property(camelContext, int.class, value)); return true;
        case "oauth2clientid":
        case "oauth2ClientId": target.setOauth2ClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "oauth2clientsecret":
        case "oauth2ClientSecret": target.setOauth2ClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "oauth2scope":
        case "oauth2Scope": target.setOauth2Scope(property(camelContext, java.lang.String.class, value)); return true;
        case "oauth2tokenendpoint":
        case "oauth2TokenEndpoint": target.setOauth2TokenEndpoint(property(camelContext, java.lang.String.class, value)); return true;
        case "okstatuscoderange":
        case "okStatusCodeRange": target.setOkStatusCodeRange(property(camelContext, java.lang.String.class, value)); return true;
        case "preservehostheader":
        case "preserveHostHeader": target.setPreserveHostHeader(property(camelContext, boolean.class, value)); return true;
        case "proxyauthdomain":
        case "proxyAuthDomain": target.setProxyAuthDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthhost":
        case "proxyAuthHost": target.setProxyAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthmethod":
        case "proxyAuthMethod": target.setProxyAuthMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthnthost":
        case "proxyAuthNtHost": target.setProxyAuthNtHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthpassword":
        case "proxyAuthPassword": target.setProxyAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthport":
        case "proxyAuthPort": target.setProxyAuthPort(property(camelContext, int.class, value)); return true;
        case "proxyauthscheme":
        case "proxyAuthScheme": target.setProxyAuthScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthusername":
        case "proxyAuthUsername": target.setProxyAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, int.class, value)); return true;
        case "skiprequestheaders":
        case "skipRequestHeaders": target.setSkipRequestHeaders(property(camelContext, boolean.class, value)); return true;
        case "skipresponseheaders":
        case "skipResponseHeaders": target.setSkipResponseHeaders(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": target.setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        case "usesystemproperties":
        case "useSystemProperties": target.setUseSystemProperties(property(camelContext, boolean.class, value)); return true;
        case "useragent":
        case "userAgent": target.setUserAgent(property(camelContext, java.lang.String.class, value)); return true;
        case "x509hostnameverifier":
        case "x509HostnameVerifier": target.setX509HostnameVerifier(property(camelContext, javax.net.ssl.HostnameVerifier.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authdomain":
        case "authDomain": return java.lang.String.class;
        case "authhost":
        case "authHost": return java.lang.String.class;
        case "authmethod":
        case "authMethod": return java.lang.String.class;
        case "authmethodpriority":
        case "authMethodPriority": return java.lang.String.class;
        case "authpassword":
        case "authPassword": return java.lang.String.class;
        case "authusername":
        case "authUsername": return java.lang.String.class;
        case "authenticationpreemptive":
        case "authenticationPreemptive": return boolean.class;
        case "bridgeendpoint":
        case "bridgeEndpoint": return boolean.class;
        case "clearexpiredcookies":
        case "clearExpiredCookies": return boolean.class;
        case "clientbuilder":
        case "clientBuilder": return org.apache.hc.client5.http.impl.classic.HttpClientBuilder.class;
        case "clientconnectionmanager":
        case "clientConnectionManager": return org.apache.hc.client5.http.io.HttpClientConnectionManager.class;
        case "connectionclose":
        case "connectionClose": return boolean.class;
        case "connectionsperroute":
        case "connectionsPerRoute": return int.class;
        case "cookiehandler":
        case "cookieHandler": return org.apache.camel.http.base.cookie.CookieHandler.class;
        case "cookiestore":
        case "cookieStore": return org.apache.hc.client5.http.cookie.CookieStore.class;
        case "copyheaders":
        case "copyHeaders": return boolean.class;
        case "customhostheader":
        case "customHostHeader": return java.lang.String.class;
        case "deletewithbody":
        case "deleteWithBody": return boolean.class;
        case "disablestreamcache":
        case "disableStreamCache": return boolean.class;
        case "followredirects":
        case "followRedirects": return boolean.class;
        case "getwithbody":
        case "getWithBody": return boolean.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "httpclient":
        case "httpClient": return org.apache.hc.client5.http.classic.HttpClient.class;
        case "httpclientconfigurer":
        case "httpClientConfigurer": return org.apache.camel.component.http.HttpClientConfigurer.class;
        case "httpclientoptions":
        case "httpClientOptions": return java.util.Map.class;
        case "httpconnectionoptions":
        case "httpConnectionOptions": return java.util.Map.class;
        case "httpcontext":
        case "httpContext": return org.apache.hc.core5.http.protocol.HttpContext.class;
        case "httpmethod":
        case "httpMethod": return org.apache.camel.http.common.HttpMethods.class;
        case "ignoreresponsebody":
        case "ignoreResponseBody": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxtotalconnections":
        case "maxTotalConnections": return int.class;
        case "oauth2clientid":
        case "oauth2ClientId": return java.lang.String.class;
        case "oauth2clientsecret":
        case "oauth2ClientSecret": return java.lang.String.class;
        case "oauth2scope":
        case "oauth2Scope": return java.lang.String.class;
        case "oauth2tokenendpoint":
        case "oauth2TokenEndpoint": return java.lang.String.class;
        case "okstatuscoderange":
        case "okStatusCodeRange": return java.lang.String.class;
        case "preservehostheader":
        case "preserveHostHeader": return boolean.class;
        case "proxyauthdomain":
        case "proxyAuthDomain": return java.lang.String.class;
        case "proxyauthhost":
        case "proxyAuthHost": return java.lang.String.class;
        case "proxyauthmethod":
        case "proxyAuthMethod": return java.lang.String.class;
        case "proxyauthnthost":
        case "proxyAuthNtHost": return java.lang.String.class;
        case "proxyauthpassword":
        case "proxyAuthPassword": return java.lang.String.class;
        case "proxyauthport":
        case "proxyAuthPort": return int.class;
        case "proxyauthscheme":
        case "proxyAuthScheme": return java.lang.String.class;
        case "proxyauthusername":
        case "proxyAuthUsername": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return int.class;
        case "skiprequestheaders":
        case "skipRequestHeaders": return boolean.class;
        case "skipresponseheaders":
        case "skipResponseHeaders": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return boolean.class;
        case "usesystemproperties":
        case "useSystemProperties": return boolean.class;
        case "useragent":
        case "userAgent": return java.lang.String.class;
        case "x509hostnameverifier":
        case "x509HostnameVerifier": return javax.net.ssl.HostnameVerifier.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        HttpEndpoint target = (HttpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authdomain":
        case "authDomain": return target.getAuthDomain();
        case "authhost":
        case "authHost": return target.getAuthHost();
        case "authmethod":
        case "authMethod": return target.getAuthMethod();
        case "authmethodpriority":
        case "authMethodPriority": return target.getAuthMethodPriority();
        case "authpassword":
        case "authPassword": return target.getAuthPassword();
        case "authusername":
        case "authUsername": return target.getAuthUsername();
        case "authenticationpreemptive":
        case "authenticationPreemptive": return target.isAuthenticationPreemptive();
        case "bridgeendpoint":
        case "bridgeEndpoint": return target.isBridgeEndpoint();
        case "clearexpiredcookies":
        case "clearExpiredCookies": return target.isClearExpiredCookies();
        case "clientbuilder":
        case "clientBuilder": return target.getClientBuilder();
        case "clientconnectionmanager":
        case "clientConnectionManager": return target.getClientConnectionManager();
        case "connectionclose":
        case "connectionClose": return target.isConnectionClose();
        case "connectionsperroute":
        case "connectionsPerRoute": return target.getConnectionsPerRoute();
        case "cookiehandler":
        case "cookieHandler": return target.getCookieHandler();
        case "cookiestore":
        case "cookieStore": return target.getCookieStore();
        case "copyheaders":
        case "copyHeaders": return target.isCopyHeaders();
        case "customhostheader":
        case "customHostHeader": return target.getCustomHostHeader();
        case "deletewithbody":
        case "deleteWithBody": return target.isDeleteWithBody();
        case "disablestreamcache":
        case "disableStreamCache": return target.isDisableStreamCache();
        case "followredirects":
        case "followRedirects": return target.isFollowRedirects();
        case "getwithbody":
        case "getWithBody": return target.isGetWithBody();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "httpclient":
        case "httpClient": return target.getHttpClient();
        case "httpclientconfigurer":
        case "httpClientConfigurer": return target.getHttpClientConfigurer();
        case "httpclientoptions":
        case "httpClientOptions": return target.getHttpClientOptions();
        case "httpconnectionoptions":
        case "httpConnectionOptions": return target.getHttpConnectionOptions();
        case "httpcontext":
        case "httpContext": return target.getHttpContext();
        case "httpmethod":
        case "httpMethod": return target.getHttpMethod();
        case "ignoreresponsebody":
        case "ignoreResponseBody": return target.isIgnoreResponseBody();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxtotalconnections":
        case "maxTotalConnections": return target.getMaxTotalConnections();
        case "oauth2clientid":
        case "oauth2ClientId": return target.getOauth2ClientId();
        case "oauth2clientsecret":
        case "oauth2ClientSecret": return target.getOauth2ClientSecret();
        case "oauth2scope":
        case "oauth2Scope": return target.getOauth2Scope();
        case "oauth2tokenendpoint":
        case "oauth2TokenEndpoint": return target.getOauth2TokenEndpoint();
        case "okstatuscoderange":
        case "okStatusCodeRange": return target.getOkStatusCodeRange();
        case "preservehostheader":
        case "preserveHostHeader": return target.isPreserveHostHeader();
        case "proxyauthdomain":
        case "proxyAuthDomain": return target.getProxyAuthDomain();
        case "proxyauthhost":
        case "proxyAuthHost": return target.getProxyAuthHost();
        case "proxyauthmethod":
        case "proxyAuthMethod": return target.getProxyAuthMethod();
        case "proxyauthnthost":
        case "proxyAuthNtHost": return target.getProxyAuthNtHost();
        case "proxyauthpassword":
        case "proxyAuthPassword": return target.getProxyAuthPassword();
        case "proxyauthport":
        case "proxyAuthPort": return target.getProxyAuthPort();
        case "proxyauthscheme":
        case "proxyAuthScheme": return target.getProxyAuthScheme();
        case "proxyauthusername":
        case "proxyAuthUsername": return target.getProxyAuthUsername();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "skiprequestheaders":
        case "skipRequestHeaders": return target.isSkipRequestHeaders();
        case "skipresponseheaders":
        case "skipResponseHeaders": return target.isSkipResponseHeaders();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": return target.isThrowExceptionOnFailure();
        case "usesystemproperties":
        case "useSystemProperties": return target.isUseSystemProperties();
        case "useragent":
        case "userAgent": return target.getUserAgent();
        case "x509hostnameverifier":
        case "x509HostnameVerifier": return target.getX509HostnameVerifier();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpclientoptions":
        case "httpClientOptions": return java.lang.Object.class;
        case "httpconnectionoptions":
        case "httpConnectionOptions": return java.lang.Object.class;
        default: return null;
        }
    }
}

