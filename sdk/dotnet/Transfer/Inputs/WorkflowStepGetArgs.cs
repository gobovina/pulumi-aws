// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Transfer.Inputs
{

    public sealed class WorkflowStepGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details for a step that performs a file copy. See Copy Step Details below.
        /// </summary>
        [Input("copyStepDetails")]
        public Input<Inputs.WorkflowStepCopyStepDetailsGetArgs>? CopyStepDetails { get; set; }

        /// <summary>
        /// Details for a step that invokes a lambda function.
        /// </summary>
        [Input("customStepDetails")]
        public Input<Inputs.WorkflowStepCustomStepDetailsGetArgs>? CustomStepDetails { get; set; }

        /// <summary>
        /// Details for a step that decrypts the file.
        /// </summary>
        [Input("decryptStepDetails")]
        public Input<Inputs.WorkflowStepDecryptStepDetailsGetArgs>? DecryptStepDetails { get; set; }

        /// <summary>
        /// Details for a step that deletes the file.
        /// </summary>
        [Input("deleteStepDetails")]
        public Input<Inputs.WorkflowStepDeleteStepDetailsGetArgs>? DeleteStepDetails { get; set; }

        /// <summary>
        /// Details for a step that creates one or more tags.
        /// </summary>
        [Input("tagStepDetails")]
        public Input<Inputs.WorkflowStepTagStepDetailsGetArgs>? TagStepDetails { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public WorkflowStepGetArgs()
        {
        }
        public static new WorkflowStepGetArgs Empty => new WorkflowStepGetArgs();
    }
}
