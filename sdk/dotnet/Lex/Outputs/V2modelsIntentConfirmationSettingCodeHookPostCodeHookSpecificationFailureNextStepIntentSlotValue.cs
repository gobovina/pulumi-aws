// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Outputs
{

    [OutputType]
    public sealed class V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotValue
    {
        /// <summary>
        /// Value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the first value in the resolvedValues list.
        /// </summary>
        public readonly string? InterpretedValue;

        [OutputConstructor]
        private V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureNextStepIntentSlotValue(string? interpretedValue)
        {
            InterpretedValue = interpretedValue;
        }
    }
}
