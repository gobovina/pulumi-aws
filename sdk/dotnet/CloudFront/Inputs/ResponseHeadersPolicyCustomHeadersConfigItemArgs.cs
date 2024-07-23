// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class ResponseHeadersPolicyCustomHeadersConfigItemArgs : global::Pulumi.ResourceArgs
    {
        [Input("header", required: true)]
        public Input<string> Header { get; set; } = null!;

        [Input("override", required: true)]
        public Input<bool> Override { get; set; } = null!;

        /// <summary>
        /// The value for the HTTP response header.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ResponseHeadersPolicyCustomHeadersConfigItemArgs()
        {
        }
        public static new ResponseHeadersPolicyCustomHeadersConfigItemArgs Empty => new ResponseHeadersPolicyCustomHeadersConfigItemArgs();
    }
}
