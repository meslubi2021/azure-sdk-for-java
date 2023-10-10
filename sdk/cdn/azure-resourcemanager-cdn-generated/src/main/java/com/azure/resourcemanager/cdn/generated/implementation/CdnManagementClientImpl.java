// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.cdn.generated.fluent.AfdCustomDomainsClient;
import com.azure.resourcemanager.cdn.generated.fluent.AfdEndpointsClient;
import com.azure.resourcemanager.cdn.generated.fluent.AfdOriginGroupsClient;
import com.azure.resourcemanager.cdn.generated.fluent.AfdOriginsClient;
import com.azure.resourcemanager.cdn.generated.fluent.AfdProfilesClient;
import com.azure.resourcemanager.cdn.generated.fluent.CdnManagementClient;
import com.azure.resourcemanager.cdn.generated.fluent.CustomDomainsClient;
import com.azure.resourcemanager.cdn.generated.fluent.EdgeNodesClient;
import com.azure.resourcemanager.cdn.generated.fluent.EndpointsClient;
import com.azure.resourcemanager.cdn.generated.fluent.LogAnalyticsClient;
import com.azure.resourcemanager.cdn.generated.fluent.ManagedRuleSetsClient;
import com.azure.resourcemanager.cdn.generated.fluent.OperationsClient;
import com.azure.resourcemanager.cdn.generated.fluent.OriginGroupsClient;
import com.azure.resourcemanager.cdn.generated.fluent.OriginsClient;
import com.azure.resourcemanager.cdn.generated.fluent.PoliciesClient;
import com.azure.resourcemanager.cdn.generated.fluent.ProfilesClient;
import com.azure.resourcemanager.cdn.generated.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.cdn.generated.fluent.ResourceUsagesClient;
import com.azure.resourcemanager.cdn.generated.fluent.RoutesClient;
import com.azure.resourcemanager.cdn.generated.fluent.RuleSetsClient;
import com.azure.resourcemanager.cdn.generated.fluent.RulesClient;
import com.azure.resourcemanager.cdn.generated.fluent.SecretsClient;
import com.azure.resourcemanager.cdn.generated.fluent.SecurityPoliciesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the CdnManagementClientImpl type. */
@ServiceClient(builder = CdnManagementClientBuilder.class)
public final class CdnManagementClientImpl implements CdnManagementClient {
    /** Azure Subscription ID. */
    private final String subscriptionId;

    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The ResourceProvidersClient object to access its operations. */
    private final ResourceProvidersClient resourceProviders;

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    public ResourceProvidersClient getResourceProviders() {
        return this.resourceProviders;
    }

    /** The AfdProfilesClient object to access its operations. */
    private final AfdProfilesClient afdProfiles;

    /**
     * Gets the AfdProfilesClient object to access its operations.
     *
     * @return the AfdProfilesClient object.
     */
    public AfdProfilesClient getAfdProfiles() {
        return this.afdProfiles;
    }

    /** The AfdCustomDomainsClient object to access its operations. */
    private final AfdCustomDomainsClient afdCustomDomains;

    /**
     * Gets the AfdCustomDomainsClient object to access its operations.
     *
     * @return the AfdCustomDomainsClient object.
     */
    public AfdCustomDomainsClient getAfdCustomDomains() {
        return this.afdCustomDomains;
    }

    /** The AfdEndpointsClient object to access its operations. */
    private final AfdEndpointsClient afdEndpoints;

    /**
     * Gets the AfdEndpointsClient object to access its operations.
     *
     * @return the AfdEndpointsClient object.
     */
    public AfdEndpointsClient getAfdEndpoints() {
        return this.afdEndpoints;
    }

    /** The AfdOriginGroupsClient object to access its operations. */
    private final AfdOriginGroupsClient afdOriginGroups;

    /**
     * Gets the AfdOriginGroupsClient object to access its operations.
     *
     * @return the AfdOriginGroupsClient object.
     */
    public AfdOriginGroupsClient getAfdOriginGroups() {
        return this.afdOriginGroups;
    }

    /** The AfdOriginsClient object to access its operations. */
    private final AfdOriginsClient afdOrigins;

    /**
     * Gets the AfdOriginsClient object to access its operations.
     *
     * @return the AfdOriginsClient object.
     */
    public AfdOriginsClient getAfdOrigins() {
        return this.afdOrigins;
    }

    /** The RoutesClient object to access its operations. */
    private final RoutesClient routes;

    /**
     * Gets the RoutesClient object to access its operations.
     *
     * @return the RoutesClient object.
     */
    public RoutesClient getRoutes() {
        return this.routes;
    }

    /** The RuleSetsClient object to access its operations. */
    private final RuleSetsClient ruleSets;

    /**
     * Gets the RuleSetsClient object to access its operations.
     *
     * @return the RuleSetsClient object.
     */
    public RuleSetsClient getRuleSets() {
        return this.ruleSets;
    }

    /** The RulesClient object to access its operations. */
    private final RulesClient rules;

    /**
     * Gets the RulesClient object to access its operations.
     *
     * @return the RulesClient object.
     */
    public RulesClient getRules() {
        return this.rules;
    }

    /** The SecurityPoliciesClient object to access its operations. */
    private final SecurityPoliciesClient securityPolicies;

    /**
     * Gets the SecurityPoliciesClient object to access its operations.
     *
     * @return the SecurityPoliciesClient object.
     */
    public SecurityPoliciesClient getSecurityPolicies() {
        return this.securityPolicies;
    }

    /** The SecretsClient object to access its operations. */
    private final SecretsClient secrets;

    /**
     * Gets the SecretsClient object to access its operations.
     *
     * @return the SecretsClient object.
     */
    public SecretsClient getSecrets() {
        return this.secrets;
    }

    /** The LogAnalyticsClient object to access its operations. */
    private final LogAnalyticsClient logAnalytics;

    /**
     * Gets the LogAnalyticsClient object to access its operations.
     *
     * @return the LogAnalyticsClient object.
     */
    public LogAnalyticsClient getLogAnalytics() {
        return this.logAnalytics;
    }

    /** The ProfilesClient object to access its operations. */
    private final ProfilesClient profiles;

    /**
     * Gets the ProfilesClient object to access its operations.
     *
     * @return the ProfilesClient object.
     */
    public ProfilesClient getProfiles() {
        return this.profiles;
    }

    /** The EndpointsClient object to access its operations. */
    private final EndpointsClient endpoints;

    /**
     * Gets the EndpointsClient object to access its operations.
     *
     * @return the EndpointsClient object.
     */
    public EndpointsClient getEndpoints() {
        return this.endpoints;
    }

    /** The OriginsClient object to access its operations. */
    private final OriginsClient origins;

    /**
     * Gets the OriginsClient object to access its operations.
     *
     * @return the OriginsClient object.
     */
    public OriginsClient getOrigins() {
        return this.origins;
    }

    /** The OriginGroupsClient object to access its operations. */
    private final OriginGroupsClient originGroups;

    /**
     * Gets the OriginGroupsClient object to access its operations.
     *
     * @return the OriginGroupsClient object.
     */
    public OriginGroupsClient getOriginGroups() {
        return this.originGroups;
    }

    /** The CustomDomainsClient object to access its operations. */
    private final CustomDomainsClient customDomains;

    /**
     * Gets the CustomDomainsClient object to access its operations.
     *
     * @return the CustomDomainsClient object.
     */
    public CustomDomainsClient getCustomDomains() {
        return this.customDomains;
    }

    /** The ResourceUsagesClient object to access its operations. */
    private final ResourceUsagesClient resourceUsages;

    /**
     * Gets the ResourceUsagesClient object to access its operations.
     *
     * @return the ResourceUsagesClient object.
     */
    public ResourceUsagesClient getResourceUsages() {
        return this.resourceUsages;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The EdgeNodesClient object to access its operations. */
    private final EdgeNodesClient edgeNodes;

    /**
     * Gets the EdgeNodesClient object to access its operations.
     *
     * @return the EdgeNodesClient object.
     */
    public EdgeNodesClient getEdgeNodes() {
        return this.edgeNodes;
    }

    /** The PoliciesClient object to access its operations. */
    private final PoliciesClient policies;

    /**
     * Gets the PoliciesClient object to access its operations.
     *
     * @return the PoliciesClient object.
     */
    public PoliciesClient getPolicies() {
        return this.policies;
    }

    /** The ManagedRuleSetsClient object to access its operations. */
    private final ManagedRuleSetsClient managedRuleSets;

    /**
     * Gets the ManagedRuleSetsClient object to access its operations.
     *
     * @return the ManagedRuleSetsClient object.
     */
    public ManagedRuleSetsClient getManagedRuleSets() {
        return this.managedRuleSets;
    }

    /**
     * Initializes an instance of CdnManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Azure Subscription ID.
     * @param endpoint server parameter.
     */
    CdnManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-05-01";
        this.resourceProviders = new ResourceProvidersClientImpl(this);
        this.afdProfiles = new AfdProfilesClientImpl(this);
        this.afdCustomDomains = new AfdCustomDomainsClientImpl(this);
        this.afdEndpoints = new AfdEndpointsClientImpl(this);
        this.afdOriginGroups = new AfdOriginGroupsClientImpl(this);
        this.afdOrigins = new AfdOriginsClientImpl(this);
        this.routes = new RoutesClientImpl(this);
        this.ruleSets = new RuleSetsClientImpl(this);
        this.rules = new RulesClientImpl(this);
        this.securityPolicies = new SecurityPoliciesClientImpl(this);
        this.secrets = new SecretsClientImpl(this);
        this.logAnalytics = new LogAnalyticsClientImpl(this);
        this.profiles = new ProfilesClientImpl(this);
        this.endpoints = new EndpointsClientImpl(this);
        this.origins = new OriginsClientImpl(this);
        this.originGroups = new OriginGroupsClientImpl(this);
        this.customDomains = new CustomDomainsClientImpl(this);
        this.resourceUsages = new ResourceUsagesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.edgeNodes = new EdgeNodesClientImpl(this);
        this.policies = new PoliciesClientImpl(this);
        this.managedRuleSets = new ManagedRuleSetsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CdnManagementClientImpl.class);
}
