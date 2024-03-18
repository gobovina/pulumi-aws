// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito.Inputs
{

    public sealed class UserPoolLambdaConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the lambda creating an authentication challenge.
        /// </summary>
        [Input("createAuthChallenge")]
        public Input<string>? CreateAuthChallenge { get; set; }

        /// <summary>
        /// A custom email sender AWS Lambda trigger. See custom_email_sender Below.
        /// </summary>
        [Input("customEmailSender")]
        public Input<Inputs.UserPoolLambdaConfigCustomEmailSenderArgs>? CustomEmailSender { get; set; }

        /// <summary>
        /// Custom Message AWS Lambda trigger.
        /// </summary>
        [Input("customMessage")]
        public Input<string>? CustomMessage { get; set; }

        /// <summary>
        /// A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
        /// </summary>
        [Input("customSmsSender")]
        public Input<Inputs.UserPoolLambdaConfigCustomSmsSenderArgs>? CustomSmsSender { get; set; }

        /// <summary>
        /// Defines the authentication challenge.
        /// </summary>
        [Input("defineAuthChallenge")]
        public Input<string>? DefineAuthChallenge { get; set; }

        /// <summary>
        /// The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Post-authentication AWS Lambda trigger.
        /// </summary>
        [Input("postAuthentication")]
        public Input<string>? PostAuthentication { get; set; }

        /// <summary>
        /// Post-confirmation AWS Lambda trigger.
        /// </summary>
        [Input("postConfirmation")]
        public Input<string>? PostConfirmation { get; set; }

        /// <summary>
        /// Pre-authentication AWS Lambda trigger.
        /// </summary>
        [Input("preAuthentication")]
        public Input<string>? PreAuthentication { get; set; }

        /// <summary>
        /// Pre-registration AWS Lambda trigger.
        /// </summary>
        [Input("preSignUp")]
        public Input<string>? PreSignUp { get; set; }

        /// <summary>
        /// Allow to customize identity token claims before token generation. Set this parameter for legacy purposes; for new instances of pre token generation triggers, set the LambdaArn of `pre_token_generation_config`.
        /// </summary>
        [Input("preTokenGeneration")]
        public Input<string>? PreTokenGeneration { get; set; }

        /// <summary>
        /// Allow to customize access tokens. See pre_token_configuration_type
        /// </summary>
        [Input("preTokenGenerationConfig")]
        public Input<Inputs.UserPoolLambdaConfigPreTokenGenerationConfigArgs>? PreTokenGenerationConfig { get; set; }

        /// <summary>
        /// User migration Lambda config type.
        /// </summary>
        [Input("userMigration")]
        public Input<string>? UserMigration { get; set; }

        /// <summary>
        /// Verifies the authentication challenge response.
        /// </summary>
        [Input("verifyAuthChallengeResponse")]
        public Input<string>? VerifyAuthChallengeResponse { get; set; }

        public UserPoolLambdaConfigArgs()
        {
        }
        public static new UserPoolLambdaConfigArgs Empty => new UserPoolLambdaConfigArgs();
    }
}
