// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Athena
{
    /// <summary>
    /// Resource for managing an Athena Prepared Statement.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Aws.S3.BucketV2("test", new()
    ///     {
    ///         Bucket = "tf-test",
    ///         ForceDestroy = true,
    ///     });
    /// 
    ///     var testWorkgroup = new Aws.Athena.Workgroup("test", new()
    ///     {
    ///         Name = "tf-test",
    ///     });
    /// 
    ///     var testDatabase = new Aws.Athena.Database("test", new()
    ///     {
    ///         Name = "example",
    ///         Bucket = test.Bucket,
    ///     });
    /// 
    ///     var testPreparedStatement = new Aws.Athena.PreparedStatement("test", new()
    ///     {
    ///         Name = "tf_test",
    ///         QueryStatement = testDatabase.Name.Apply(name =&gt; $"SELECT * FROM {name} WHERE x = ?"),
    ///         Workgroup = testWorkgroup.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Athena Prepared Statement using the `WORKGROUP-NAME/STATEMENT-NAME`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:athena/preparedStatement:PreparedStatement example 12345abcde/example
    /// ```
    /// </summary>
    [AwsResourceType("aws:athena/preparedStatement:PreparedStatement")]
    public partial class PreparedStatement : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Brief explanation of prepared statement. Maximum length of 1024.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the prepared statement. Maximum length of 256.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The query string for the prepared statement.
        /// </summary>
        [Output("queryStatement")]
        public Output<string> QueryStatement { get; private set; } = null!;

        /// <summary>
        /// The name of the workgroup to which the prepared statement belongs.
        /// </summary>
        [Output("workgroup")]
        public Output<string> Workgroup { get; private set; } = null!;


        /// <summary>
        /// Create a PreparedStatement resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PreparedStatement(string name, PreparedStatementArgs args, CustomResourceOptions? options = null)
            : base("aws:athena/preparedStatement:PreparedStatement", name, args ?? new PreparedStatementArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PreparedStatement(string name, Input<string> id, PreparedStatementState? state = null, CustomResourceOptions? options = null)
            : base("aws:athena/preparedStatement:PreparedStatement", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PreparedStatement resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PreparedStatement Get(string name, Input<string> id, PreparedStatementState? state = null, CustomResourceOptions? options = null)
        {
            return new PreparedStatement(name, id, state, options);
        }
    }

    public sealed class PreparedStatementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Brief explanation of prepared statement. Maximum length of 1024.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the prepared statement. Maximum length of 256.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The query string for the prepared statement.
        /// </summary>
        [Input("queryStatement", required: true)]
        public Input<string> QueryStatement { get; set; } = null!;

        /// <summary>
        /// The name of the workgroup to which the prepared statement belongs.
        /// </summary>
        [Input("workgroup", required: true)]
        public Input<string> Workgroup { get; set; } = null!;

        public PreparedStatementArgs()
        {
        }
        public static new PreparedStatementArgs Empty => new PreparedStatementArgs();
    }

    public sealed class PreparedStatementState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Brief explanation of prepared statement. Maximum length of 1024.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the prepared statement. Maximum length of 256.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The query string for the prepared statement.
        /// </summary>
        [Input("queryStatement")]
        public Input<string>? QueryStatement { get; set; }

        /// <summary>
        /// The name of the workgroup to which the prepared statement belongs.
        /// </summary>
        [Input("workgroup")]
        public Input<string>? Workgroup { get; set; }

        public PreparedStatementState()
        {
        }
        public static new PreparedStatementState Empty => new PreparedStatementState();
    }
}
