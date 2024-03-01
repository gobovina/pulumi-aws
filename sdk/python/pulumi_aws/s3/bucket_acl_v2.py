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

__all__ = ['BucketAclV2Args', 'BucketAclV2']

@pulumi.input_type
class BucketAclV2Args:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str],
                 access_control_policy: Optional[pulumi.Input['BucketAclV2AccessControlPolicyArgs']] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BucketAclV2 resource.
        :param pulumi.Input[str] bucket: Bucket to which to apply the ACL.
        :param pulumi.Input['BucketAclV2AccessControlPolicyArgs'] access_control_policy: Configuration block that sets the ACL permissions for an object per grantee. See below.
        :param pulumi.Input[str] acl: Canned ACL to apply to the bucket.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        """
        pulumi.set(__self__, "bucket", bucket)
        if access_control_policy is not None:
            pulumi.set(__self__, "access_control_policy", access_control_policy)
        if acl is not None:
            pulumi.set(__self__, "acl", acl)
        if expected_bucket_owner is not None:
            pulumi.set(__self__, "expected_bucket_owner", expected_bucket_owner)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        Bucket to which to apply the ACL.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter(name="accessControlPolicy")
    def access_control_policy(self) -> Optional[pulumi.Input['BucketAclV2AccessControlPolicyArgs']]:
        """
        Configuration block that sets the ACL permissions for an object per grantee. See below.
        """
        return pulumi.get(self, "access_control_policy")

    @access_control_policy.setter
    def access_control_policy(self, value: Optional[pulumi.Input['BucketAclV2AccessControlPolicyArgs']]):
        pulumi.set(self, "access_control_policy", value)

    @property
    @pulumi.getter
    def acl(self) -> Optional[pulumi.Input[str]]:
        """
        Canned ACL to apply to the bucket.
        """
        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl", value)

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
class _BucketAclV2State:
    def __init__(__self__, *,
                 access_control_policy: Optional[pulumi.Input['BucketAclV2AccessControlPolicyArgs']] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BucketAclV2 resources.
        :param pulumi.Input['BucketAclV2AccessControlPolicyArgs'] access_control_policy: Configuration block that sets the ACL permissions for an object per grantee. See below.
        :param pulumi.Input[str] acl: Canned ACL to apply to the bucket.
        :param pulumi.Input[str] bucket: Bucket to which to apply the ACL.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        """
        if access_control_policy is not None:
            pulumi.set(__self__, "access_control_policy", access_control_policy)
        if acl is not None:
            pulumi.set(__self__, "acl", acl)
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if expected_bucket_owner is not None:
            pulumi.set(__self__, "expected_bucket_owner", expected_bucket_owner)

    @property
    @pulumi.getter(name="accessControlPolicy")
    def access_control_policy(self) -> Optional[pulumi.Input['BucketAclV2AccessControlPolicyArgs']]:
        """
        Configuration block that sets the ACL permissions for an object per grantee. See below.
        """
        return pulumi.get(self, "access_control_policy")

    @access_control_policy.setter
    def access_control_policy(self, value: Optional[pulumi.Input['BucketAclV2AccessControlPolicyArgs']]):
        pulumi.set(self, "access_control_policy", value)

    @property
    @pulumi.getter
    def acl(self) -> Optional[pulumi.Input[str]]:
        """
        Canned ACL to apply to the bucket.
        """
        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl", value)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        Bucket to which to apply the ACL.
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


class BucketAclV2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_control_policy: Optional[pulumi.Input[pulumi.InputType['BucketAclV2AccessControlPolicyArgs']]] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an S3 bucket ACL resource.

        > **Note:** destroy does not delete the S3 Bucket ACL but does remove the resource from state.

        > This resource cannot be used with S3 directory buckets.

        ## Example Usage
        ### With `private` ACL

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3.BucketV2("example", bucket="my-tf-example-bucket")
        example_bucket_ownership_controls = aws.s3.BucketOwnershipControls("example",
            bucket=example.id,
            rule=aws.s3.BucketOwnershipControlsRuleArgs(
                object_ownership="BucketOwnerPreferred",
            ))
        example_bucket_acl_v2 = aws.s3.BucketAclV2("example",
            bucket=example.id,
            acl="private")
        ```
        ### With `public-read` ACL

        > This example explicitly disables the default S3 bucket security settings. This
        should be done with caution, as all bucket objects become publicly exposed.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3.BucketV2("example", bucket="my-tf-example-bucket")
        example_bucket_ownership_controls = aws.s3.BucketOwnershipControls("example",
            bucket=example.id,
            rule=aws.s3.BucketOwnershipControlsRuleArgs(
                object_ownership="BucketOwnerPreferred",
            ))
        example_bucket_public_access_block = aws.s3.BucketPublicAccessBlock("example",
            bucket=example.id,
            block_public_acls=False,
            block_public_policy=False,
            ignore_public_acls=False,
            restrict_public_buckets=False)
        example_bucket_acl_v2 = aws.s3.BucketAclV2("example",
            bucket=example.id,
            acl="public-read")
        ```
        ### With Grants

        ```python
        import pulumi
        import pulumi_aws as aws

        current = aws.s3.get_canonical_user_id()
        example = aws.s3.BucketV2("example", bucket="my-tf-example-bucket")
        example_bucket_ownership_controls = aws.s3.BucketOwnershipControls("example",
            bucket=example.id,
            rule=aws.s3.BucketOwnershipControlsRuleArgs(
                object_ownership="BucketOwnerPreferred",
            ))
        example_bucket_acl_v2 = aws.s3.BucketAclV2("example",
            bucket=example.id,
            access_control_policy=aws.s3.BucketAclV2AccessControlPolicyArgs(
                grants=[
                    aws.s3.BucketAclV2AccessControlPolicyGrantArgs(
                        grantee=aws.s3.BucketAclV2AccessControlPolicyGrantGranteeArgs(
                            id=current.id,
                            type="CanonicalUser",
                        ),
                        permission="READ",
                    ),
                    aws.s3.BucketAclV2AccessControlPolicyGrantArgs(
                        grantee=aws.s3.BucketAclV2AccessControlPolicyGrantGranteeArgs(
                            type="Group",
                            uri="http://acs.amazonaws.com/groups/s3/LogDelivery",
                        ),
                        permission="READ_ACP",
                    ),
                ],
                owner=aws.s3.BucketAclV2AccessControlPolicyOwnerArgs(
                    id=current.id,
                ),
            ))
        ```

        ## Import

        If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket` and `acl` separated by a comma (`,`):

        If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`):

        __Using `pulumi import` to import__ using `bucket`, `expected_bucket_owner`, and/or `acl`, depending on your situation. For example:

        If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket`:

        ```sh
         $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name
        ```
         If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket` and `acl` separated by a comma (`,`):

        ```sh
         $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,private
        ```
         If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        ```sh
         $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012
        ```
         If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`):

        ```sh
         $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012,private
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['BucketAclV2AccessControlPolicyArgs']] access_control_policy: Configuration block that sets the ACL permissions for an object per grantee. See below.
        :param pulumi.Input[str] acl: Canned ACL to apply to the bucket.
        :param pulumi.Input[str] bucket: Bucket to which to apply the ACL.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BucketAclV2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an S3 bucket ACL resource.

        > **Note:** destroy does not delete the S3 Bucket ACL but does remove the resource from state.

        > This resource cannot be used with S3 directory buckets.

        ## Example Usage
        ### With `private` ACL

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3.BucketV2("example", bucket="my-tf-example-bucket")
        example_bucket_ownership_controls = aws.s3.BucketOwnershipControls("example",
            bucket=example.id,
            rule=aws.s3.BucketOwnershipControlsRuleArgs(
                object_ownership="BucketOwnerPreferred",
            ))
        example_bucket_acl_v2 = aws.s3.BucketAclV2("example",
            bucket=example.id,
            acl="private")
        ```
        ### With `public-read` ACL

        > This example explicitly disables the default S3 bucket security settings. This
        should be done with caution, as all bucket objects become publicly exposed.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3.BucketV2("example", bucket="my-tf-example-bucket")
        example_bucket_ownership_controls = aws.s3.BucketOwnershipControls("example",
            bucket=example.id,
            rule=aws.s3.BucketOwnershipControlsRuleArgs(
                object_ownership="BucketOwnerPreferred",
            ))
        example_bucket_public_access_block = aws.s3.BucketPublicAccessBlock("example",
            bucket=example.id,
            block_public_acls=False,
            block_public_policy=False,
            ignore_public_acls=False,
            restrict_public_buckets=False)
        example_bucket_acl_v2 = aws.s3.BucketAclV2("example",
            bucket=example.id,
            acl="public-read")
        ```
        ### With Grants

        ```python
        import pulumi
        import pulumi_aws as aws

        current = aws.s3.get_canonical_user_id()
        example = aws.s3.BucketV2("example", bucket="my-tf-example-bucket")
        example_bucket_ownership_controls = aws.s3.BucketOwnershipControls("example",
            bucket=example.id,
            rule=aws.s3.BucketOwnershipControlsRuleArgs(
                object_ownership="BucketOwnerPreferred",
            ))
        example_bucket_acl_v2 = aws.s3.BucketAclV2("example",
            bucket=example.id,
            access_control_policy=aws.s3.BucketAclV2AccessControlPolicyArgs(
                grants=[
                    aws.s3.BucketAclV2AccessControlPolicyGrantArgs(
                        grantee=aws.s3.BucketAclV2AccessControlPolicyGrantGranteeArgs(
                            id=current.id,
                            type="CanonicalUser",
                        ),
                        permission="READ",
                    ),
                    aws.s3.BucketAclV2AccessControlPolicyGrantArgs(
                        grantee=aws.s3.BucketAclV2AccessControlPolicyGrantGranteeArgs(
                            type="Group",
                            uri="http://acs.amazonaws.com/groups/s3/LogDelivery",
                        ),
                        permission="READ_ACP",
                    ),
                ],
                owner=aws.s3.BucketAclV2AccessControlPolicyOwnerArgs(
                    id=current.id,
                ),
            ))
        ```

        ## Import

        If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket` and `acl` separated by a comma (`,`):

        If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`):

        __Using `pulumi import` to import__ using `bucket`, `expected_bucket_owner`, and/or `acl`, depending on your situation. For example:

        If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket`:

        ```sh
         $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name
        ```
         If the owner (account ID) of the source bucket is the _same_ account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), import using the `bucket` and `acl` separated by a comma (`,`):

        ```sh
         $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,private
        ```
         If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __not configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):

        ```sh
         $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012
        ```
         If the owner (account ID) of the source bucket _differs_ from the account used to configure the AWS Provider, and the source bucket is __configured__ with a [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) (i.e. predefined grant), imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`):

        ```sh
         $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012,private
        ```

        :param str resource_name: The name of the resource.
        :param BucketAclV2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BucketAclV2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_control_policy: Optional[pulumi.Input[pulumi.InputType['BucketAclV2AccessControlPolicyArgs']]] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 expected_bucket_owner: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BucketAclV2Args.__new__(BucketAclV2Args)

            __props__.__dict__["access_control_policy"] = access_control_policy
            __props__.__dict__["acl"] = acl
            if bucket is None and not opts.urn:
                raise TypeError("Missing required property 'bucket'")
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["expected_bucket_owner"] = expected_bucket_owner
        super(BucketAclV2, __self__).__init__(
            'aws:s3/bucketAclV2:BucketAclV2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_control_policy: Optional[pulumi.Input[pulumi.InputType['BucketAclV2AccessControlPolicyArgs']]] = None,
            acl: Optional[pulumi.Input[str]] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            expected_bucket_owner: Optional[pulumi.Input[str]] = None) -> 'BucketAclV2':
        """
        Get an existing BucketAclV2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['BucketAclV2AccessControlPolicyArgs']] access_control_policy: Configuration block that sets the ACL permissions for an object per grantee. See below.
        :param pulumi.Input[str] acl: Canned ACL to apply to the bucket.
        :param pulumi.Input[str] bucket: Bucket to which to apply the ACL.
        :param pulumi.Input[str] expected_bucket_owner: Account ID of the expected bucket owner.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BucketAclV2State.__new__(_BucketAclV2State)

        __props__.__dict__["access_control_policy"] = access_control_policy
        __props__.__dict__["acl"] = acl
        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["expected_bucket_owner"] = expected_bucket_owner
        return BucketAclV2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessControlPolicy")
    def access_control_policy(self) -> pulumi.Output['outputs.BucketAclV2AccessControlPolicy']:
        """
        Configuration block that sets the ACL permissions for an object per grantee. See below.
        """
        return pulumi.get(self, "access_control_policy")

    @property
    @pulumi.getter
    def acl(self) -> pulumi.Output[Optional[str]]:
        """
        Canned ACL to apply to the bucket.
        """
        return pulumi.get(self, "acl")

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[str]:
        """
        Bucket to which to apply the ACL.
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter(name="expectedBucketOwner")
    def expected_bucket_owner(self) -> pulumi.Output[Optional[str]]:
        """
        Account ID of the expected bucket owner.
        """
        return pulumi.get(self, "expected_bucket_owner")

