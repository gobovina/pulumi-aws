# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BucketAccelerateConfigurationV2Args', 'BucketAccelerateConfigurationV2']

@pulumi.input_type
class BucketAccelerateConfigurationV2Args:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 status: pulumi.Input[str],
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BucketAccelerateConfigurationV2 resource.
        :param pulumi.Input[str] bucket: Name of the bucket.
        :param pulumi.Input[str] status: Transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        """
        pulumi.set(__self__, "bucket", bucket)
        pulumi.set(__self__, "status", status)
        if expected_bucket_owner is not None:
            pulumi.set(__self__, "expected_bucket_owner", expected_bucket_owner)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        Name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[str]:
        """
        Transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="expectedBucketOwner")
    def expected_bucket_owner(self) -> Optional[pulumi.Input[str]]:
        """
        Account ID of the expected bucket owner.
        """
        return pulumi.get(self, "expected_bucket_owner")

    @expected_bucket_owner.setter
    def expected_bucket_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expected_bucket_owner", value)


@pulumi.input_type
class _BucketAccelerateConfigurationV2State:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BucketAccelerateConfigurationV2 resources.
        :param pulumi.Input[str] bucket: Name of the bucket.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        :param pulumi.Input[str] status: Transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if expected_bucket_owner is not None:
            pulumi.set(__self__, "expected_bucket_owner", expected_bucket_owner)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter(name="expectedBucketOwner")
    def expected_bucket_owner(self) -> Optional[pulumi.Input[str]]:
        """
        Account ID of the expected bucket owner.
        """
        return pulumi.get(self, "expected_bucket_owner")

    @expected_bucket_owner.setter
    def expected_bucket_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expected_bucket_owner", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class BucketAccelerateConfigurationV2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an S3 bucket accelerate configuration resource. See the [Requirements for using Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html#transfer-acceleration-requirements) for more details.

        > This resource cannot be used with S3 directory buckets.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        mybucket = aws.s3.BucketV2("mybucket", bucket="mybucket")
        example = aws.s3.BucketAccelerateConfigurationV2("example",
            bucket=mybucket.id,
            status="Enabled")
        ```

        ## Import

        If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        __Using `pulumi import` to import.__ For example:

        If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:

        ```sh
         $ pulumi import aws:s3/bucketAccelerateConfigurationV2:BucketAccelerateConfigurationV2 example bucket-name
        ```
         If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        ```sh
         $ pulumi import aws:s3/bucketAccelerateConfigurationV2:BucketAccelerateConfigurationV2 example bucket-name,123456789012
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: Name of the bucket.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        :param pulumi.Input[str] status: Transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketAccelerateConfigurationV2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an S3 bucket accelerate configuration resource. See the [Requirements for using Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html#transfer-acceleration-requirements) for more details.

        > This resource cannot be used with S3 directory buckets.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        mybucket = aws.s3.BucketV2("mybucket", bucket="mybucket")
        example = aws.s3.BucketAccelerateConfigurationV2("example",
            bucket=mybucket.id,
            status="Enabled")
        ```

        ## Import

        If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        __Using `pulumi import` to import.__ For example:

        If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:

        ```sh
         $ pulumi import aws:s3/bucketAccelerateConfigurationV2:BucketAccelerateConfigurationV2 example bucket-name
        ```
         If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        ```sh
         $ pulumi import aws:s3/bucketAccelerateConfigurationV2:BucketAccelerateConfigurationV2 example bucket-name,123456789012
        ```

        :param str resource_name: The name of the resource.
        :param BucketAccelerateConfigurationV2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketAccelerateConfigurationV2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketAccelerateConfigurationV2Args.__new__(BucketAccelerateConfigurationV2Args)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["expected_bucket_owner"] = expected_bucket_owner
            if status is None and not opts.urn:
                raise TypeError("Missing required property 'status'")
            __props__.__dict__["status"] = status
        super(BucketAccelerateConfigurationV2, __self__).__init__(
            'aws:s3/bucketAccelerateConfigurationV2:BucketAccelerateConfigurationV2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            expected_bucket_owner: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'BucketAccelerateConfigurationV2':
        """
        Get an existing BucketAccelerateConfigurationV2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: Name of the bucket.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        :param pulumi.Input[str] status: Transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketAccelerateConfigurationV2State.__new__(_BucketAccelerateConfigurationV2State)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["expected_bucket_owner"] = expected_bucket_owner
        __props__.__dict__["status"] = status
        return BucketAccelerateConfigurationV2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        Name of the bucket.
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter(name="expectedBucketOwner")
    def expected_bucket_owner(self) -> pulumi.Output[Optional[str]]:
        """
        Account ID of the expected bucket owner.
        """
        return pulumi.get(self, "expected_bucket_owner")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Transfer acceleration state of the bucket. Valid values: `Enabled`, `Suspended`.
        """
        return pulumi.get(self, "status")

