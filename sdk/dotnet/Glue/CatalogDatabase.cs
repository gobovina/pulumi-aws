// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue
{
    /// <summary>
    /// Provides a Glue Catalog Database Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var awsGlueCatalogDatabase = new Aws.Glue.CatalogDatabase("awsGlueCatalogDatabase", new Aws.Glue.CatalogDatabaseArgs
    ///         {
    ///             Name = "MyCatalogDatabase",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Create Table Default Permissions
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var awsGlueCatalogDatabase = new Aws.Glue.CatalogDatabase("awsGlueCatalogDatabase", new Aws.Glue.CatalogDatabaseArgs
    ///         {
    ///             CreateTableDefaultPermissions = 
    ///             {
    ///                 new Aws.Glue.Inputs.CatalogDatabaseCreateTableDefaultPermissionArgs
    ///                 {
    ///                     Permissions = 
    ///                     {
    ///                         "SELECT",
    ///                     },
    ///                     Principal = new Aws.Glue.Inputs.CatalogDatabaseCreateTableDefaultPermissionPrincipalArgs
    ///                     {
    ///                         DataLakePrincipalIdentifier = "IAM_ALLOWED_PRINCIPALS",
    ///                     },
    ///                 },
    ///             },
    ///             Name = "MyCatalogDatabase",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Glue Catalog Databases can be imported using the `catalog_id:name`. If you have not set a Catalog ID specify the AWS Account ID that the database is in, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:glue/catalogDatabase:CatalogDatabase database 123456789012:my_database
    /// ```
    /// </summary>
    [AwsResourceType("aws:glue/catalogDatabase:CatalogDatabase")]
    public partial class CatalogDatabase : Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Glue Catalog Database.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// ID of the Data Catalog in which the database resides.
        /// </summary>
        [Output("catalogId")]
        public Output<string> CatalogId { get; private set; } = null!;

        /// <summary>
        /// Creates a set of default permissions on the table for principals. See `create_table_default_permission` below.
        /// </summary>
        [Output("createTableDefaultPermissions")]
        public Output<ImmutableArray<Outputs.CatalogDatabaseCreateTableDefaultPermission>> CreateTableDefaultPermissions { get; private set; } = null!;

        /// <summary>
        /// Description of the database.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Location of the database (for example, an HDFS path).
        /// </summary>
        [Output("locationUri")]
        public Output<string> LocationUri { get; private set; } = null!;

        /// <summary>
        /// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// List of key-value pairs that define parameters and properties of the database.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// Configuration block for a target database for resource linking. See `target_database` below.
        /// </summary>
        [Output("targetDatabase")]
        public Output<Outputs.CatalogDatabaseTargetDatabase?> TargetDatabase { get; private set; } = null!;


        /// <summary>
        /// Create a CatalogDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CatalogDatabase(string name, CatalogDatabaseArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:glue/catalogDatabase:CatalogDatabase", name, args ?? new CatalogDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CatalogDatabase(string name, Input<string> id, CatalogDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("aws:glue/catalogDatabase:CatalogDatabase", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CatalogDatabase Get(string name, Input<string> id, CatalogDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new CatalogDatabase(name, id, state, options);
        }
    }

    public sealed class CatalogDatabaseArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the Data Catalog in which the database resides.
        /// </summary>
        [Input("catalogId")]
        public Input<string>? CatalogId { get; set; }

        [Input("createTableDefaultPermissions")]
        private InputList<Inputs.CatalogDatabaseCreateTableDefaultPermissionArgs>? _createTableDefaultPermissions;

        /// <summary>
        /// Creates a set of default permissions on the table for principals. See `create_table_default_permission` below.
        /// </summary>
        public InputList<Inputs.CatalogDatabaseCreateTableDefaultPermissionArgs> CreateTableDefaultPermissions
        {
            get => _createTableDefaultPermissions ?? (_createTableDefaultPermissions = new InputList<Inputs.CatalogDatabaseCreateTableDefaultPermissionArgs>());
            set => _createTableDefaultPermissions = value;
        }

        /// <summary>
        /// Description of the database.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Location of the database (for example, an HDFS path).
        /// </summary>
        [Input("locationUri")]
        public Input<string>? LocationUri { get; set; }

        /// <summary>
        /// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// List of key-value pairs that define parameters and properties of the database.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Configuration block for a target database for resource linking. See `target_database` below.
        /// </summary>
        [Input("targetDatabase")]
        public Input<Inputs.CatalogDatabaseTargetDatabaseArgs>? TargetDatabase { get; set; }

        public CatalogDatabaseArgs()
        {
        }
    }

    public sealed class CatalogDatabaseState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Glue Catalog Database.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// ID of the Data Catalog in which the database resides.
        /// </summary>
        [Input("catalogId")]
        public Input<string>? CatalogId { get; set; }

        [Input("createTableDefaultPermissions")]
        private InputList<Inputs.CatalogDatabaseCreateTableDefaultPermissionGetArgs>? _createTableDefaultPermissions;

        /// <summary>
        /// Creates a set of default permissions on the table for principals. See `create_table_default_permission` below.
        /// </summary>
        public InputList<Inputs.CatalogDatabaseCreateTableDefaultPermissionGetArgs> CreateTableDefaultPermissions
        {
            get => _createTableDefaultPermissions ?? (_createTableDefaultPermissions = new InputList<Inputs.CatalogDatabaseCreateTableDefaultPermissionGetArgs>());
            set => _createTableDefaultPermissions = value;
        }

        /// <summary>
        /// Description of the database.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Location of the database (for example, an HDFS path).
        /// </summary>
        [Input("locationUri")]
        public Input<string>? LocationUri { get; set; }

        /// <summary>
        /// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// List of key-value pairs that define parameters and properties of the database.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Configuration block for a target database for resource linking. See `target_database` below.
        /// </summary>
        [Input("targetDatabase")]
        public Input<Inputs.CatalogDatabaseTargetDatabaseGetArgs>? TargetDatabase { get; set; }

        public CatalogDatabaseState()
        {
        }
    }
}
