// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPolicyDocumentStatementNotPrincipal extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyDocumentStatementNotPrincipal Empty = new GetPolicyDocumentStatementNotPrincipal();

    /**
     * List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     * 
     */
    @Import(name="identifiers", required=true)
    private List<String> identifiers;

    /**
     * @return List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     * 
     */
    public List<String> identifiers() {
        return this.identifiers;
    }

    /**
     * Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetPolicyDocumentStatementNotPrincipal() {}

    private GetPolicyDocumentStatementNotPrincipal(GetPolicyDocumentStatementNotPrincipal $) {
        this.identifiers = $.identifiers;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDocumentStatementNotPrincipal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDocumentStatementNotPrincipal $;

        public Builder() {
            $ = new GetPolicyDocumentStatementNotPrincipal();
        }

        public Builder(GetPolicyDocumentStatementNotPrincipal defaults) {
            $ = new GetPolicyDocumentStatementNotPrincipal(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifiers List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
         * 
         * @return builder
         * 
         */
        public Builder identifiers(List<String> identifiers) {
            $.identifiers = identifiers;
            return this;
        }

        /**
         * @param identifiers List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
         * 
         * @return builder
         * 
         */
        public Builder identifiers(String... identifiers) {
            return identifiers(List.of(identifiers));
        }

        /**
         * @param type Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetPolicyDocumentStatementNotPrincipal build() {
            if ($.identifiers == null) {
                throw new MissingRequiredPropertyException("GetPolicyDocumentStatementNotPrincipal", "identifiers");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetPolicyDocumentStatementNotPrincipal", "type");
            }
            return $;
        }
    }

}
