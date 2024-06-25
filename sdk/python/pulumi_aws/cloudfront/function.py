# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['FunctionArgs', 'Function']

@pulumi.input_type
class FunctionArgs:
    def __init__(__self__, *,
                 code: pulumi.Input[str],
                 runtime: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 key_value_store_associations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 publish: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Function resource.
        :param pulumi.Input[str] code: Source code of the function
        :param pulumi.Input[str] runtime: Identifier of the function's runtime. Valid values are `cloudfront-js-1.0` and `cloudfront-js-2.0`.
               
               The following arguments are optional:
        :param pulumi.Input[str] comment: Comment.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_value_store_associations: List of `cloudfront.KeyValueStore` ARNs to be associated to the function. AWS limits associations to on key value store per function.
        :param pulumi.Input[str] name: Unique name for your CloudFront Function.
        :param pulumi.Input[bool] publish: Whether to publish creation/change as Live CloudFront Function Version. Defaults to `true`.
        """
        pulumi.set(__self__, "code", code)
        pulumi.set(__self__, "runtime", runtime)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if key_value_store_associations is not None:
            pulumi.set(__self__, "key_value_store_associations", key_value_store_associations)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if publish is not None:
            pulumi.set(__self__, "publish", publish)

    @property
    @pulumi.getter
    def code(self) -> pulumi.Input[str]:
        """
        Source code of the function
        """
        return pulumi.get(self, "code")

    @code.setter
    def code(self, value: pulumi.Input[str]):
        pulumi.set(self, "code", value)

    @property
    @pulumi.getter
    def runtime(self) -> pulumi.Input[str]:
        """
        Identifier of the function's runtime. Valid values are `cloudfront-js-1.0` and `cloudfront-js-2.0`.

        The following arguments are optional:
        """
        return pulumi.get(self, "runtime")

    @runtime.setter
    def runtime(self, value: pulumi.Input[str]):
        pulumi.set(self, "runtime", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="keyValueStoreAssociations")
    def key_value_store_associations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of `cloudfront.KeyValueStore` ARNs to be associated to the function. AWS limits associations to on key value store per function.
        """
        return pulumi.get(self, "key_value_store_associations")

    @key_value_store_associations.setter
    def key_value_store_associations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "key_value_store_associations", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique name for your CloudFront Function.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def publish(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to publish creation/change as Live CloudFront Function Version. Defaults to `true`.
        """
        return pulumi.get(self, "publish")

    @publish.setter
    def publish(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publish", value)


@pulumi.input_type
class _FunctionState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 code: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 key_value_store_associations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 live_stage_etag: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 publish: Optional[pulumi.Input[bool]] = None,
                 runtime: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Function resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) identifying your CloudFront Function.
        :param pulumi.Input[str] code: Source code of the function
        :param pulumi.Input[str] comment: Comment.
        :param pulumi.Input[str] etag: ETag hash of the function. This is the value for the `DEVELOPMENT` stage of the function.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_value_store_associations: List of `cloudfront.KeyValueStore` ARNs to be associated to the function. AWS limits associations to on key value store per function.
        :param pulumi.Input[str] live_stage_etag: ETag hash of any `LIVE` stage of the function.
        :param pulumi.Input[str] name: Unique name for your CloudFront Function.
        :param pulumi.Input[bool] publish: Whether to publish creation/change as Live CloudFront Function Version. Defaults to `true`.
        :param pulumi.Input[str] runtime: Identifier of the function's runtime. Valid values are `cloudfront-js-1.0` and `cloudfront-js-2.0`.
               
               The following arguments are optional:
        :param pulumi.Input[str] status: Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if code is not None:
            pulumi.set(__self__, "code", code)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if key_value_store_associations is not None:
            pulumi.set(__self__, "key_value_store_associations", key_value_store_associations)
        if live_stage_etag is not None:
            pulumi.set(__self__, "live_stage_etag", live_stage_etag)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if publish is not None:
            pulumi.set(__self__, "publish", publish)
        if runtime is not None:
            pulumi.set(__self__, "runtime", runtime)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) identifying your CloudFront Function.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def code(self) -> Optional[pulumi.Input[str]]:
        """
        Source code of the function
        """
        return pulumi.get(self, "code")

    @code.setter
    def code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "code", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        """
        ETag hash of the function. This is the value for the `DEVELOPMENT` stage of the function.
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter(name="keyValueStoreAssociations")
    def key_value_store_associations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of `cloudfront.KeyValueStore` ARNs to be associated to the function. AWS limits associations to on key value store per function.
        """
        return pulumi.get(self, "key_value_store_associations")

    @key_value_store_associations.setter
    def key_value_store_associations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "key_value_store_associations", value)

    @property
    @pulumi.getter(name="liveStageEtag")
    def live_stage_etag(self) -> Optional[pulumi.Input[str]]:
        """
        ETag hash of any `LIVE` stage of the function.
        """
        return pulumi.get(self, "live_stage_etag")

    @live_stage_etag.setter
    def live_stage_etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "live_stage_etag", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique name for your CloudFront Function.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def publish(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to publish creation/change as Live CloudFront Function Version. Defaults to `true`.
        """
        return pulumi.get(self, "publish")

    @publish.setter
    def publish(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publish", value)

    @property
    @pulumi.getter
    def runtime(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the function's runtime. Valid values are `cloudfront-js-1.0` and `cloudfront-js-2.0`.

        The following arguments are optional:
        """
        return pulumi.get(self, "runtime")

    @runtime.setter
    def runtime(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runtime", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class Function(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 code: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 key_value_store_associations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 publish: Optional[pulumi.Input[bool]] = None,
                 runtime: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CloudFront Function resource. With CloudFront Functions in Amazon CloudFront, you can write lightweight functions in JavaScript for high-scale, latency-sensitive CDN customizations.

        See [CloudFront Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-functions.html)

        > **NOTE:** You cannot delete a function if it’s associated with a cache behavior. First, update your distributions to remove the function association from all cache behaviors, then delete the function.

        ## Example Usage

        ## Import

        Using `pulumi import`, import CloudFront Functions using the `name`. For example:

        ```sh
        $ pulumi import aws:cloudfront/function:Function test my_test_function
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] code: Source code of the function
        :param pulumi.Input[str] comment: Comment.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_value_store_associations: List of `cloudfront.KeyValueStore` ARNs to be associated to the function. AWS limits associations to on key value store per function.
        :param pulumi.Input[str] name: Unique name for your CloudFront Function.
        :param pulumi.Input[bool] publish: Whether to publish creation/change as Live CloudFront Function Version. Defaults to `true`.
        :param pulumi.Input[str] runtime: Identifier of the function's runtime. Valid values are `cloudfront-js-1.0` and `cloudfront-js-2.0`.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FunctionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CloudFront Function resource. With CloudFront Functions in Amazon CloudFront, you can write lightweight functions in JavaScript for high-scale, latency-sensitive CDN customizations.

        See [CloudFront Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-functions.html)

        > **NOTE:** You cannot delete a function if it’s associated with a cache behavior. First, update your distributions to remove the function association from all cache behaviors, then delete the function.

        ## Example Usage

        ## Import

        Using `pulumi import`, import CloudFront Functions using the `name`. For example:

        ```sh
        $ pulumi import aws:cloudfront/function:Function test my_test_function
        ```

        :param str resource_name: The name of the resource.
        :param FunctionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FunctionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 code: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 key_value_store_associations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 publish: Optional[pulumi.Input[bool]] = None,
                 runtime: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FunctionArgs.__new__(FunctionArgs)

            if code is None and not opts.urn:
                raise TypeError("Missing required property 'code'")
            __props__.__dict__["code"] = code
            __props__.__dict__["comment"] = comment
            __props__.__dict__["key_value_store_associations"] = key_value_store_associations
            __props__.__dict__["name"] = name
            __props__.__dict__["publish"] = publish
            if runtime is None and not opts.urn:
                raise TypeError("Missing required property 'runtime'")
            __props__.__dict__["runtime"] = runtime
            __props__.__dict__["arn"] = None
            __props__.__dict__["etag"] = None
            __props__.__dict__["live_stage_etag"] = None
            __props__.__dict__["status"] = None
        super(Function, __self__).__init__(
            'aws:cloudfront/function:Function',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            code: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            etag: Optional[pulumi.Input[str]] = None,
            key_value_store_associations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            live_stage_etag: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            publish: Optional[pulumi.Input[bool]] = None,
            runtime: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'Function':
        """
        Get an existing Function resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) identifying your CloudFront Function.
        :param pulumi.Input[str] code: Source code of the function
        :param pulumi.Input[str] comment: Comment.
        :param pulumi.Input[str] etag: ETag hash of the function. This is the value for the `DEVELOPMENT` stage of the function.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_value_store_associations: List of `cloudfront.KeyValueStore` ARNs to be associated to the function. AWS limits associations to on key value store per function.
        :param pulumi.Input[str] live_stage_etag: ETag hash of any `LIVE` stage of the function.
        :param pulumi.Input[str] name: Unique name for your CloudFront Function.
        :param pulumi.Input[bool] publish: Whether to publish creation/change as Live CloudFront Function Version. Defaults to `true`.
        :param pulumi.Input[str] runtime: Identifier of the function's runtime. Valid values are `cloudfront-js-1.0` and `cloudfront-js-2.0`.
               
               The following arguments are optional:
        :param pulumi.Input[str] status: Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FunctionState.__new__(_FunctionState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["code"] = code
        __props__.__dict__["comment"] = comment
        __props__.__dict__["etag"] = etag
        __props__.__dict__["key_value_store_associations"] = key_value_store_associations
        __props__.__dict__["live_stage_etag"] = live_stage_etag
        __props__.__dict__["name"] = name
        __props__.__dict__["publish"] = publish
        __props__.__dict__["runtime"] = runtime
        __props__.__dict__["status"] = status
        return Function(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) identifying your CloudFront Function.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def code(self) -> pulumi.Output[str]:
        """
        Source code of the function
        """
        return pulumi.get(self, "code")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Comment.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        """
        ETag hash of the function. This is the value for the `DEVELOPMENT` stage of the function.
        """
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter(name="keyValueStoreAssociations")
    def key_value_store_associations(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of `cloudfront.KeyValueStore` ARNs to be associated to the function. AWS limits associations to on key value store per function.
        """
        return pulumi.get(self, "key_value_store_associations")

    @property
    @pulumi.getter(name="liveStageEtag")
    def live_stage_etag(self) -> pulumi.Output[str]:
        """
        ETag hash of any `LIVE` stage of the function.
        """
        return pulumi.get(self, "live_stage_etag")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Unique name for your CloudFront Function.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def publish(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to publish creation/change as Live CloudFront Function Version. Defaults to `true`.
        """
        return pulumi.get(self, "publish")

    @property
    @pulumi.getter
    def runtime(self) -> pulumi.Output[str]:
        """
        Identifier of the function's runtime. Valid values are `cloudfront-js-1.0` and `cloudfront-js-2.0`.

        The following arguments are optional:
        """
        return pulumi.get(self, "runtime")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
        """
        return pulumi.get(self, "status")

