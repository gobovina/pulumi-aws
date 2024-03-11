# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['BucketServerSideEncryptionConfigurationV2Args', 'BucketServerSideEncryptionConfigurationV2']

@pulumi.input_type
class BucketServerSideEncryptionConfigurationV2Args:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 rules: pulumi.Input[Sequence[pulumi.Input['BucketServerSideEncryptionConfigurationV2RuleArgs']]],
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BucketServerSideEncryptionConfigurationV2 resource.
        :param pulumi.Input[str] bucket: ID (name) of the bucket.
        :param pulumi.Input[Sequence[pulumi.Input['BucketServerSideEncryptionConfigurationV2RuleArgs']]] rules: Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        """
        pulumi.set(__self__, "bucket", bucket)
        pulumi.set(__self__, "rules", rules)
        if expected_bucket_owner is not None:
            pulumi.set(__self__, "expected_bucket_owner", expected_bucket_owner)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        ID (name) of the bucket.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Input[Sequence[pulumi.Input['BucketServerSideEncryptionConfigurationV2RuleArgs']]]:
        """
        Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: pulumi.Input[Sequence[pulumi.Input['BucketServerSideEncryptionConfigurationV2RuleArgs']]]):
        pulumi.set(self, "rules", value)

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
class _BucketServerSideEncryptionConfigurationV2State:
    def __init__(__self__, *,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['BucketServerSideEncryptionConfigurationV2RuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering BucketServerSideEncryptionConfigurationV2 resources.
        :param pulumi.Input[str] bucket: ID (name) of the bucket.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        :param pulumi.Input[Sequence[pulumi.Input['BucketServerSideEncryptionConfigurationV2RuleArgs']]] rules: Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
        """
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if expected_bucket_owner is not None:
            pulumi.set(__self__, "expected_bucket_owner", expected_bucket_owner)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        ID (name) of the bucket.
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
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BucketServerSideEncryptionConfigurationV2RuleArgs']]]]:
        """
        Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BucketServerSideEncryptionConfigurationV2RuleArgs']]]]):
        pulumi.set(self, "rules", value)


class BucketServerSideEncryptionConfigurationV2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketServerSideEncryptionConfigurationV2RuleArgs']]]]] = None,
                 __props__=None):
        """
        Provides a S3 bucket server-side encryption configuration resource.

        > **NOTE:** Destroying an `s3.BucketServerSideEncryptionConfigurationV2` resource resets the bucket to [Amazon S3 bucket default encryption](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-encryption-faq.html).

        > This resource cannot be used with S3 directory buckets.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        mykey = aws.kms.Key("mykey",
            description="This key is used to encrypt bucket objects",
            deletion_window_in_days=10)
        mybucket = aws.s3.BucketV2("mybucket", bucket="mybucket")
        example = aws.s3.BucketServerSideEncryptionConfigurationV2("example",
            bucket=mybucket.id,
            rules=[aws.s3.BucketServerSideEncryptionConfigurationV2RuleArgs(
                apply_server_side_encryption_by_default=aws.s3.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs(
                    kms_master_key_id=mykey.arn,
                    sse_algorithm="aws:kms",
                ),
            )])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        __Using `pulumi import` to import__ S3 bucket server-side encryption configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:

        If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:

        ```sh
        $ pulumi import aws:s3/bucketServerSideEncryptionConfigurationV2:BucketServerSideEncryptionConfigurationV2 example bucket-name
        ```
        If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        ```sh
        $ pulumi import aws:s3/bucketServerSideEncryptionConfigurationV2:BucketServerSideEncryptionConfigurationV2 example bucket-name,123456789012
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: ID (name) of the bucket.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketServerSideEncryptionConfigurationV2RuleArgs']]]] rules: Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketServerSideEncryptionConfigurationV2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a S3 bucket server-side encryption configuration resource.

        > **NOTE:** Destroying an `s3.BucketServerSideEncryptionConfigurationV2` resource resets the bucket to [Amazon S3 bucket default encryption](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-encryption-faq.html).

        > This resource cannot be used with S3 directory buckets.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        mykey = aws.kms.Key("mykey",
            description="This key is used to encrypt bucket objects",
            deletion_window_in_days=10)
        mybucket = aws.s3.BucketV2("mybucket", bucket="mybucket")
        example = aws.s3.BucketServerSideEncryptionConfigurationV2("example",
            bucket=mybucket.id,
            rules=[aws.s3.BucketServerSideEncryptionConfigurationV2RuleArgs(
                apply_server_side_encryption_by_default=aws.s3.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs(
                    kms_master_key_id=mykey.arn,
                    sse_algorithm="aws:kms",
                ),
            )])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        __Using `pulumi import` to import__ S3 bucket server-side encryption configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:

        If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:

        ```sh
        $ pulumi import aws:s3/bucketServerSideEncryptionConfigurationV2:BucketServerSideEncryptionConfigurationV2 example bucket-name
        ```
        If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        ```sh
        $ pulumi import aws:s3/bucketServerSideEncryptionConfigurationV2:BucketServerSideEncryptionConfigurationV2 example bucket-name,123456789012
        ```

        :param str resource_name: The name of the resource.
        :param BucketServerSideEncryptionConfigurationV2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketServerSideEncryptionConfigurationV2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketServerSideEncryptionConfigurationV2RuleArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketServerSideEncryptionConfigurationV2Args.__new__(BucketServerSideEncryptionConfigurationV2Args)

            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["expected_bucket_owner"] = expected_bucket_owner
            if rules is None and not opts.urn:
                raise TypeError("Missing required property 'rules'")
            __props__.__dict__["rules"] = rules
        super(BucketServerSideEncryptionConfigurationV2, __self__).__init__(
            'aws:s3/bucketServerSideEncryptionConfigurationV2:BucketServerSideEncryptionConfigurationV2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            expected_bucket_owner: Optional[pulumi.Input[str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketServerSideEncryptionConfigurationV2RuleArgs']]]]] = None) -> 'BucketServerSideEncryptionConfigurationV2':
        """
        Get an existing BucketServerSideEncryptionConfigurationV2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket: ID (name) of the bucket.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BucketServerSideEncryptionConfigurationV2RuleArgs']]]] rules: Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketServerSideEncryptionConfigurationV2State.__new__(_BucketServerSideEncryptionConfigurationV2State)

        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["expected_bucket_owner"] = expected_bucket_owner
        __props__.__dict__["rules"] = rules
        return BucketServerSideEncryptionConfigurationV2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        ID (name) of the bucket.
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
    def rules(self) -> pulumi.Output[Sequence['outputs.BucketServerSideEncryptionConfigurationV2Rule']]:
        """
        Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
        """
        return pulumi.get(self, "rules")

