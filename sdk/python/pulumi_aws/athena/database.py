# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DatabaseArgs', 'Database']

@pulumi.input_type
class DatabaseArgs:
    def __init__(__self__, *,
                 acl_configuration: Optional[pulumi.Input['DatabaseAclConfigurationArgs']] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 encryption_configuration: Optional[pulumi.Input['DatabaseEncryptionConfigurationArgs']] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Database resource.
        :param pulumi.Input['DatabaseAclConfigurationArgs'] acl_configuration: Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
        :param pulumi.Input[str] bucket: Name of S3 bucket to save the results of the query execution.
        :param pulumi.Input[str] comment: Description of the database.
        :param pulumi.Input['DatabaseEncryptionConfigurationArgs'] encryption_configuration: The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
        :param pulumi.Input[str] expected_bucket_owner: The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
        :param pulumi.Input[str] name: Name of the database to create.
        """
        if acl_configuration is not None:
            pulumi.set(__self__, "acl_configuration", acl_configuration)
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if encryption_configuration is not None:
            pulumi.set(__self__, "encryption_configuration", encryption_configuration)
        if expected_bucket_owner is not None:
            pulumi.set(__self__, "expected_bucket_owner", expected_bucket_owner)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="aclConfiguration")
    def acl_configuration(self) -> Optional[pulumi.Input['DatabaseAclConfigurationArgs']]:
        """
        Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
        """
        return pulumi.get(self, "acl_configuration")

    @acl_configuration.setter
    def acl_configuration(self, value: Optional[pulumi.Input['DatabaseAclConfigurationArgs']]):
        pulumi.set(self, "acl_configuration", value)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        Name of S3 bucket to save the results of the query execution.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the database.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="encryptionConfiguration")
    def encryption_configuration(self) -> Optional[pulumi.Input['DatabaseEncryptionConfigurationArgs']]:
        """
        The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
        """
        return pulumi.get(self, "encryption_configuration")

    @encryption_configuration.setter
    def encryption_configuration(self, value: Optional[pulumi.Input['DatabaseEncryptionConfigurationArgs']]):
        pulumi.set(self, "encryption_configuration", value)

    @property
    @pulumi.getter(name="expectedBucketOwner")
    def expected_bucket_owner(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
        """
        return pulumi.get(self, "expected_bucket_owner")

    @expected_bucket_owner.setter
    def expected_bucket_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expected_bucket_owner", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DatabaseState:
    def __init__(__self__, *,
                 acl_configuration: Optional[pulumi.Input['DatabaseAclConfigurationArgs']] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 encryption_configuration: Optional[pulumi.Input['DatabaseEncryptionConfigurationArgs']] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Database resources.
        :param pulumi.Input['DatabaseAclConfigurationArgs'] acl_configuration: Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
        :param pulumi.Input[str] bucket: Name of S3 bucket to save the results of the query execution.
        :param pulumi.Input[str] comment: Description of the database.
        :param pulumi.Input['DatabaseEncryptionConfigurationArgs'] encryption_configuration: The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
        :param pulumi.Input[str] expected_bucket_owner: The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
        :param pulumi.Input[str] name: Name of the database to create.
        """
        if acl_configuration is not None:
            pulumi.set(__self__, "acl_configuration", acl_configuration)
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if encryption_configuration is not None:
            pulumi.set(__self__, "encryption_configuration", encryption_configuration)
        if expected_bucket_owner is not None:
            pulumi.set(__self__, "expected_bucket_owner", expected_bucket_owner)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="aclConfiguration")
    def acl_configuration(self) -> Optional[pulumi.Input['DatabaseAclConfigurationArgs']]:
        """
        Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
        """
        return pulumi.get(self, "acl_configuration")

    @acl_configuration.setter
    def acl_configuration(self, value: Optional[pulumi.Input['DatabaseAclConfigurationArgs']]):
        pulumi.set(self, "acl_configuration", value)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        Name of S3 bucket to save the results of the query execution.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the database.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="encryptionConfiguration")
    def encryption_configuration(self) -> Optional[pulumi.Input['DatabaseEncryptionConfigurationArgs']]:
        """
        The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
        """
        return pulumi.get(self, "encryption_configuration")

    @encryption_configuration.setter
    def encryption_configuration(self, value: Optional[pulumi.Input['DatabaseEncryptionConfigurationArgs']]):
        pulumi.set(self, "encryption_configuration", value)

    @property
    @pulumi.getter(name="expectedBucketOwner")
    def expected_bucket_owner(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
        """
        return pulumi.get(self, "expected_bucket_owner")

    @expected_bucket_owner.setter
    def expected_bucket_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expected_bucket_owner", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Database(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl_configuration: Optional[pulumi.Input[pulumi.InputType['DatabaseAclConfigurationArgs']]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 encryption_configuration: Optional[pulumi.Input[pulumi.InputType['DatabaseEncryptionConfigurationArgs']]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Athena database.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_bucket_v2 = aws.s3.BucketV2("exampleBucketV2")
        example_database = aws.athena.Database("exampleDatabase",
            name="database_name",
            bucket=example_bucket_v2.bucket)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DatabaseAclConfigurationArgs']] acl_configuration: Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
        :param pulumi.Input[str] bucket: Name of S3 bucket to save the results of the query execution.
        :param pulumi.Input[str] comment: Description of the database.
        :param pulumi.Input[pulumi.InputType['DatabaseEncryptionConfigurationArgs']] encryption_configuration: The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
        :param pulumi.Input[str] expected_bucket_owner: The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
        :param pulumi.Input[str] name: Name of the database to create.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DatabaseArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Athena database.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_bucket_v2 = aws.s3.BucketV2("exampleBucketV2")
        example_database = aws.athena.Database("exampleDatabase",
            name="database_name",
            bucket=example_bucket_v2.bucket)
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl_configuration: Optional[pulumi.Input[pulumi.InputType['DatabaseAclConfigurationArgs']]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 encryption_configuration: Optional[pulumi.Input[pulumi.InputType['DatabaseEncryptionConfigurationArgs']]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseArgs.__new__(DatabaseArgs)

            __props__.__dict__["acl_configuration"] = acl_configuration
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["comment"] = comment
            __props__.__dict__["encryption_configuration"] = encryption_configuration
            __props__.__dict__["expected_bucket_owner"] = expected_bucket_owner
            __props__.__dict__["force_destroy"] = force_destroy
            __props__.__dict__["name"] = name
        super(Database, __self__).__init__(
            'aws:athena/database:Database',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acl_configuration: Optional[pulumi.Input[pulumi.InputType['DatabaseAclConfigurationArgs']]] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            encryption_configuration: Optional[pulumi.Input[pulumi.InputType['DatabaseEncryptionConfigurationArgs']]] = None,
            expected_bucket_owner: Optional[pulumi.Input[str]] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Database':
        """
        Get an existing Database resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DatabaseAclConfigurationArgs']] acl_configuration: Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
        :param pulumi.Input[str] bucket: Name of S3 bucket to save the results of the query execution.
        :param pulumi.Input[str] comment: Description of the database.
        :param pulumi.Input[pulumi.InputType['DatabaseEncryptionConfigurationArgs']] encryption_configuration: The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
        :param pulumi.Input[str] expected_bucket_owner: The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
        :param pulumi.Input[bool] force_destroy: A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
        :param pulumi.Input[str] name: Name of the database to create.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseState.__new__(_DatabaseState)

        __props__.__dict__["acl_configuration"] = acl_configuration
        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["comment"] = comment
        __props__.__dict__["encryption_configuration"] = encryption_configuration
        __props__.__dict__["expected_bucket_owner"] = expected_bucket_owner
        __props__.__dict__["force_destroy"] = force_destroy
        __props__.__dict__["name"] = name
        return Database(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aclConfiguration")
    def acl_configuration(self) -> pulumi.Output[Optional['outputs.DatabaseAclConfiguration']]:
        """
        Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
        """
        return pulumi.get(self, "acl_configuration")

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[Optional[str]]:
        """
        Name of S3 bucket to save the results of the query execution.
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the database.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="encryptionConfiguration")
    def encryption_configuration(self) -> pulumi.Output[Optional['outputs.DatabaseEncryptionConfiguration']]:
        """
        The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
        """
        return pulumi.get(self, "encryption_configuration")

    @property
    @pulumi.getter(name="expectedBucketOwner")
    def expected_bucket_owner(self) -> pulumi.Output[Optional[str]]:
        """
        The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
        """
        return pulumi.get(self, "expected_bucket_owner")

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
        """
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the database to create.
        """
        return pulumi.get(self, "name")

