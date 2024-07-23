// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds.Inputs
{

    public sealed class InstanceS3ImportGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bucket name where your backup is stored
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// Can be blank, but is the path to your backup
        /// </summary>
        [Input("bucketPrefix")]
        public Input<string>? BucketPrefix { get; set; }

        /// <summary>
        /// Role applied to load the data.
        /// </summary>
        [Input("ingestionRole", required: true)]
        public Input<string> IngestionRole { get; set; } = null!;

        /// <summary>
        /// Source engine for the backup
        /// </summary>
        [Input("sourceEngine", required: true)]
        public Input<string> SourceEngine { get; set; } = null!;

        /// <summary>
        /// Version of the source engine used to make the backup
        /// 
        /// This will not recreate the resource if the S3 object changes in some way.  It's only used to initialize the database.
        /// </summary>
        [Input("sourceEngineVersion", required: true)]
        public Input<string> SourceEngineVersion { get; set; } = null!;

        public InstanceS3ImportGetArgs()
        {
        }
        public static new InstanceS3ImportGetArgs Empty => new InstanceS3ImportGetArgs();
    }
}
