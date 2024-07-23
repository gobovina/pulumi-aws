// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class IntentSlotValueElicitationPromptArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
        /// </summary>
        [Input("maxAttempts", required: true)]
        public Input<int> MaxAttempts { get; set; } = null!;

        [Input("messages", required: true)]
        private InputList<Inputs.IntentSlotValueElicitationPromptMessageArgs>? _messages;
        public InputList<Inputs.IntentSlotValueElicitationPromptMessageArgs> Messages
        {
            get => _messages ?? (_messages = new InputList<Inputs.IntentSlotValueElicitationPromptMessageArgs>());
            set => _messages = value;
        }

        [Input("responseCard")]
        public Input<string>? ResponseCard { get; set; }

        public IntentSlotValueElicitationPromptArgs()
        {
        }
        public static new IntentSlotValueElicitationPromptArgs Empty => new IntentSlotValueElicitationPromptArgs();
    }
}
