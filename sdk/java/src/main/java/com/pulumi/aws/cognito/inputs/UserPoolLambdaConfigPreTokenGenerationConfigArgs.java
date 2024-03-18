// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class UserPoolLambdaConfigPreTokenGenerationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolLambdaConfigPreTokenGenerationConfigArgs Empty = new UserPoolLambdaConfigPreTokenGenerationConfigArgs();

    /**
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send email notifications to users.
     * 
     */
    @Import(name="lambdaArn", required=true)
    private Output<String> lambdaArn;

    /**
     * @return The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send email notifications to users.
     * 
     */
    public Output<String> lambdaArn() {
        return this.lambdaArn;
    }

    /**
     * The Lambda version represents the signature of the &#34;request&#34; attribute in the &#34;event&#34; information Amazon Cognito passes to your custom email Lambda function. The only supported value is `V1_0`.
     * 
     */
    @Import(name="lambdaVersion", required=true)
    private Output<String> lambdaVersion;

    /**
     * @return The Lambda version represents the signature of the &#34;request&#34; attribute in the &#34;event&#34; information Amazon Cognito passes to your custom email Lambda function. The only supported value is `V1_0`.
     * 
     */
    public Output<String> lambdaVersion() {
        return this.lambdaVersion;
    }

    private UserPoolLambdaConfigPreTokenGenerationConfigArgs() {}

    private UserPoolLambdaConfigPreTokenGenerationConfigArgs(UserPoolLambdaConfigPreTokenGenerationConfigArgs $) {
        this.lambdaArn = $.lambdaArn;
        this.lambdaVersion = $.lambdaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolLambdaConfigPreTokenGenerationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolLambdaConfigPreTokenGenerationConfigArgs $;

        public Builder() {
            $ = new UserPoolLambdaConfigPreTokenGenerationConfigArgs();
        }

        public Builder(UserPoolLambdaConfigPreTokenGenerationConfigArgs defaults) {
            $ = new UserPoolLambdaConfigPreTokenGenerationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lambdaArn The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send email notifications to users.
         * 
         * @return builder
         * 
         */
        public Builder lambdaArn(Output<String> lambdaArn) {
            $.lambdaArn = lambdaArn;
            return this;
        }

        /**
         * @param lambdaArn The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send email notifications to users.
         * 
         * @return builder
         * 
         */
        public Builder lambdaArn(String lambdaArn) {
            return lambdaArn(Output.of(lambdaArn));
        }

        /**
         * @param lambdaVersion The Lambda version represents the signature of the &#34;request&#34; attribute in the &#34;event&#34; information Amazon Cognito passes to your custom email Lambda function. The only supported value is `V1_0`.
         * 
         * @return builder
         * 
         */
        public Builder lambdaVersion(Output<String> lambdaVersion) {
            $.lambdaVersion = lambdaVersion;
            return this;
        }

        /**
         * @param lambdaVersion The Lambda version represents the signature of the &#34;request&#34; attribute in the &#34;event&#34; information Amazon Cognito passes to your custom email Lambda function. The only supported value is `V1_0`.
         * 
         * @return builder
         * 
         */
        public Builder lambdaVersion(String lambdaVersion) {
            return lambdaVersion(Output.of(lambdaVersion));
        }

        public UserPoolLambdaConfigPreTokenGenerationConfigArgs build() {
            if ($.lambdaArn == null) {
                throw new MissingRequiredPropertyException("UserPoolLambdaConfigPreTokenGenerationConfigArgs", "lambdaArn");
            }
            if ($.lambdaVersion == null) {
                throw new MissingRequiredPropertyException("UserPoolLambdaConfigPreTokenGenerationConfigArgs", "lambdaVersion");
            }
            return $;
        }
    }

}
