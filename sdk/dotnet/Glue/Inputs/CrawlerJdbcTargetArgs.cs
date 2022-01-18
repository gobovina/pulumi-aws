// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue.Inputs
{

    public sealed class CrawlerJdbcTargetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the connection to use to connect to the Delta table target.
        /// </summary>
        [Input("connectionName", required: true)]
        public Input<string> ConnectionName { get; set; } = null!;

        [Input("exclusions")]
        private InputList<string>? _exclusions;

        /// <summary>
        /// A list of glob patterns used to exclude from the crawl.
        /// </summary>
        public InputList<string> Exclusions
        {
            get => _exclusions ?? (_exclusions = new InputList<string>());
            set => _exclusions = value;
        }

        /// <summary>
        /// The path of the Amazon DocumentDB or MongoDB target (database/collection).
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public CrawlerJdbcTargetArgs()
        {
        }
    }
}
