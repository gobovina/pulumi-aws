# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SamplingRuleArgs', 'SamplingRule']

@pulumi.input_type
class SamplingRuleArgs:
    def __init__(__self__, *,
                 fixed_rate: pulumi.Input[float],
                 host: pulumi.Input[str],
                 http_method: pulumi.Input[str],
                 priority: pulumi.Input[int],
                 reservoir_size: pulumi.Input[int],
                 resource_arn: pulumi.Input[str],
                 service_name: pulumi.Input[str],
                 service_type: pulumi.Input[str],
                 url_path: pulumi.Input[str],
                 version: pulumi.Input[int],
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SamplingRule resource.
        :param pulumi.Input[float] fixed_rate: The percentage of matching requests to instrument, after the reservoir is exhausted.
        :param pulumi.Input[str] host: Matches the hostname from a request URL.
        :param pulumi.Input[str] http_method: Matches the HTTP method of a request.
        :param pulumi.Input[int] priority: The priority of the sampling rule.
        :param pulumi.Input[int] reservoir_size: A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
        :param pulumi.Input[str] resource_arn: Matches the ARN of the AWS resource on which the service runs.
        :param pulumi.Input[str] service_name: Matches the `name` that the service uses to identify itself in segments.
        :param pulumi.Input[str] service_type: Matches the `origin` that the service uses to identify its type in segments.
        :param pulumi.Input[str] url_path: Matches the path from a request URL.
        :param pulumi.Input[int] version: The version of the sampling rule format (`1` )
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Matches attributes derived from the request.
        :param pulumi.Input[str] rule_name: The name of the sampling rule.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        pulumi.set(__self__, "fixed_rate", fixed_rate)
        pulumi.set(__self__, "host", host)
        pulumi.set(__self__, "http_method", http_method)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "reservoir_size", reservoir_size)
        pulumi.set(__self__, "resource_arn", resource_arn)
        pulumi.set(__self__, "service_name", service_name)
        pulumi.set(__self__, "service_type", service_type)
        pulumi.set(__self__, "url_path", url_path)
        pulumi.set(__self__, "version", version)
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if rule_name is not None:
            pulumi.set(__self__, "rule_name", rule_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="fixedRate")
    def fixed_rate(self) -> pulumi.Input[float]:
        """
        The percentage of matching requests to instrument, after the reservoir is exhausted.
        """
        return pulumi.get(self, "fixed_rate")

    @fixed_rate.setter
    def fixed_rate(self, value: pulumi.Input[float]):
        pulumi.set(self, "fixed_rate", value)

    @property
    @pulumi.getter
    def host(self) -> pulumi.Input[str]:
        """
        Matches the hostname from a request URL.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: pulumi.Input[str]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> pulumi.Input[str]:
        """
        Matches the HTTP method of a request.
        """
        return pulumi.get(self, "http_method")

    @http_method.setter
    def http_method(self, value: pulumi.Input[str]):
        pulumi.set(self, "http_method", value)

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Input[int]:
        """
        The priority of the sampling rule.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[int]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="reservoirSize")
    def reservoir_size(self) -> pulumi.Input[int]:
        """
        A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
        """
        return pulumi.get(self, "reservoir_size")

    @reservoir_size.setter
    def reservoir_size(self, value: pulumi.Input[int]):
        pulumi.set(self, "reservoir_size", value)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Input[str]:
        """
        Matches the ARN of the AWS resource on which the service runs.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        Matches the `name` that the service uses to identify itself in segments.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> pulumi.Input[str]:
        """
        Matches the `origin` that the service uses to identify its type in segments.
        """
        return pulumi.get(self, "service_type")

    @service_type.setter
    def service_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_type", value)

    @property
    @pulumi.getter(name="urlPath")
    def url_path(self) -> pulumi.Input[str]:
        """
        Matches the path from a request URL.
        """
        return pulumi.get(self, "url_path")

    @url_path.setter
    def url_path(self, value: pulumi.Input[str]):
        pulumi.set(self, "url_path", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[int]:
        """
        The version of the sampling rule format (`1` )
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[int]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Matches attributes derived from the request.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the sampling rule.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _SamplingRuleState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 fixed_rate: Optional[pulumi.Input[float]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 http_method: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 reservoir_size: Optional[pulumi.Input[int]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 service_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 url_path: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering SamplingRule resources.
        :param pulumi.Input[str] arn: The ARN of the sampling rule.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Matches attributes derived from the request.
        :param pulumi.Input[float] fixed_rate: The percentage of matching requests to instrument, after the reservoir is exhausted.
        :param pulumi.Input[str] host: Matches the hostname from a request URL.
        :param pulumi.Input[str] http_method: Matches the HTTP method of a request.
        :param pulumi.Input[int] priority: The priority of the sampling rule.
        :param pulumi.Input[int] reservoir_size: A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
        :param pulumi.Input[str] resource_arn: Matches the ARN of the AWS resource on which the service runs.
        :param pulumi.Input[str] rule_name: The name of the sampling rule.
        :param pulumi.Input[str] service_name: Matches the `name` that the service uses to identify itself in segments.
        :param pulumi.Input[str] service_type: Matches the `origin` that the service uses to identify its type in segments.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] url_path: Matches the path from a request URL.
        :param pulumi.Input[int] version: The version of the sampling rule format (`1` )
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if fixed_rate is not None:
            pulumi.set(__self__, "fixed_rate", fixed_rate)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if http_method is not None:
            pulumi.set(__self__, "http_method", http_method)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if reservoir_size is not None:
            pulumi.set(__self__, "reservoir_size", reservoir_size)
        if resource_arn is not None:
            pulumi.set(__self__, "resource_arn", resource_arn)
        if rule_name is not None:
            pulumi.set(__self__, "rule_name", rule_name)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if service_type is not None:
            pulumi.set(__self__, "service_type", service_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if url_path is not None:
            pulumi.set(__self__, "url_path", url_path)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the sampling rule.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Matches attributes derived from the request.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter(name="fixedRate")
    def fixed_rate(self) -> Optional[pulumi.Input[float]]:
        """
        The percentage of matching requests to instrument, after the reservoir is exhausted.
        """
        return pulumi.get(self, "fixed_rate")

    @fixed_rate.setter
    def fixed_rate(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "fixed_rate", value)

    @property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[str]]:
        """
        Matches the hostname from a request URL.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> Optional[pulumi.Input[str]]:
        """
        Matches the HTTP method of a request.
        """
        return pulumi.get(self, "http_method")

    @http_method.setter
    def http_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "http_method", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the sampling rule.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="reservoirSize")
    def reservoir_size(self) -> Optional[pulumi.Input[int]]:
        """
        A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
        """
        return pulumi.get(self, "reservoir_size")

    @reservoir_size.setter
    def reservoir_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "reservoir_size", value)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Matches the ARN of the AWS resource on which the service runs.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the sampling rule.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_name", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        Matches the `name` that the service uses to identify itself in segments.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> Optional[pulumi.Input[str]]:
        """
        Matches the `origin` that the service uses to identify its type in segments.
        """
        return pulumi.get(self, "service_type")

    @service_type.setter
    def service_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="urlPath")
    def url_path(self) -> Optional[pulumi.Input[str]]:
        """
        Matches the path from a request URL.
        """
        return pulumi.get(self, "url_path")

    @url_path.setter
    def url_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url_path", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        The version of the sampling rule format (`1` )
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class SamplingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 fixed_rate: Optional[pulumi.Input[float]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 http_method: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 reservoir_size: Optional[pulumi.Input[int]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 service_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 url_path: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Creates and manages an AWS XRay Sampling Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.xray.SamplingRule("example",
            rule_name="example",
            priority=9999,
            version=1,
            reservoir_size=1,
            fixed_rate=0.05,
            url_path="*",
            host="*",
            http_method="*",
            service_type="*",
            service_name="*",
            resource_arn="*",
            attributes={
                "Hello": "Tris",
            })
        ```

        ## Import

        Using `pulumi import`, import XRay Sampling Rules using the name. For example:

        ```sh
         $ pulumi import aws:xray/samplingRule:SamplingRule example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Matches attributes derived from the request.
        :param pulumi.Input[float] fixed_rate: The percentage of matching requests to instrument, after the reservoir is exhausted.
        :param pulumi.Input[str] host: Matches the hostname from a request URL.
        :param pulumi.Input[str] http_method: Matches the HTTP method of a request.
        :param pulumi.Input[int] priority: The priority of the sampling rule.
        :param pulumi.Input[int] reservoir_size: A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
        :param pulumi.Input[str] resource_arn: Matches the ARN of the AWS resource on which the service runs.
        :param pulumi.Input[str] rule_name: The name of the sampling rule.
        :param pulumi.Input[str] service_name: Matches the `name` that the service uses to identify itself in segments.
        :param pulumi.Input[str] service_type: Matches the `origin` that the service uses to identify its type in segments.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        :param pulumi.Input[str] url_path: Matches the path from a request URL.
        :param pulumi.Input[int] version: The version of the sampling rule format (`1` )
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SamplingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages an AWS XRay Sampling Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.xray.SamplingRule("example",
            rule_name="example",
            priority=9999,
            version=1,
            reservoir_size=1,
            fixed_rate=0.05,
            url_path="*",
            host="*",
            http_method="*",
            service_type="*",
            service_name="*",
            resource_arn="*",
            attributes={
                "Hello": "Tris",
            })
        ```

        ## Import

        Using `pulumi import`, import XRay Sampling Rules using the name. For example:

        ```sh
         $ pulumi import aws:xray/samplingRule:SamplingRule example example
        ```

        :param str resource_name: The name of the resource.
        :param SamplingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SamplingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 fixed_rate: Optional[pulumi.Input[float]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 http_method: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 reservoir_size: Optional[pulumi.Input[int]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 service_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 url_path: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SamplingRuleArgs.__new__(SamplingRuleArgs)

            __props__.__dict__["attributes"] = attributes
            if fixed_rate is None and not opts.urn:
                raise TypeError("Missing required property 'fixed_rate'")
            __props__.__dict__["fixed_rate"] = fixed_rate
            if host is None and not opts.urn:
                raise TypeError("Missing required property 'host'")
            __props__.__dict__["host"] = host
            if http_method is None and not opts.urn:
                raise TypeError("Missing required property 'http_method'")
            __props__.__dict__["http_method"] = http_method
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            if reservoir_size is None and not opts.urn:
                raise TypeError("Missing required property 'reservoir_size'")
            __props__.__dict__["reservoir_size"] = reservoir_size
            if resource_arn is None and not opts.urn:
                raise TypeError("Missing required property 'resource_arn'")
            __props__.__dict__["resource_arn"] = resource_arn
            __props__.__dict__["rule_name"] = rule_name
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            if service_type is None and not opts.urn:
                raise TypeError("Missing required property 'service_type'")
            __props__.__dict__["service_type"] = service_type
            __props__.__dict__["tags"] = tags
            if url_path is None and not opts.urn:
                raise TypeError("Missing required property 'url_path'")
            __props__.__dict__["url_path"] = url_path
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(SamplingRule, __self__).__init__(
            'aws:xray/samplingRule:SamplingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            fixed_rate: Optional[pulumi.Input[float]] = None,
            host: Optional[pulumi.Input[str]] = None,
            http_method: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            reservoir_size: Optional[pulumi.Input[int]] = None,
            resource_arn: Optional[pulumi.Input[str]] = None,
            rule_name: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            service_type: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            url_path: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'SamplingRule':
        """
        Get an existing SamplingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the sampling rule.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Matches attributes derived from the request.
        :param pulumi.Input[float] fixed_rate: The percentage of matching requests to instrument, after the reservoir is exhausted.
        :param pulumi.Input[str] host: Matches the hostname from a request URL.
        :param pulumi.Input[str] http_method: Matches the HTTP method of a request.
        :param pulumi.Input[int] priority: The priority of the sampling rule.
        :param pulumi.Input[int] reservoir_size: A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
        :param pulumi.Input[str] resource_arn: Matches the ARN of the AWS resource on which the service runs.
        :param pulumi.Input[str] rule_name: The name of the sampling rule.
        :param pulumi.Input[str] service_name: Matches the `name` that the service uses to identify itself in segments.
        :param pulumi.Input[str] service_type: Matches the `origin` that the service uses to identify its type in segments.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] url_path: Matches the path from a request URL.
        :param pulumi.Input[int] version: The version of the sampling rule format (`1` )
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SamplingRuleState.__new__(_SamplingRuleState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["attributes"] = attributes
        __props__.__dict__["fixed_rate"] = fixed_rate
        __props__.__dict__["host"] = host
        __props__.__dict__["http_method"] = http_method
        __props__.__dict__["priority"] = priority
        __props__.__dict__["reservoir_size"] = reservoir_size
        __props__.__dict__["resource_arn"] = resource_arn
        __props__.__dict__["rule_name"] = rule_name
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["service_type"] = service_type
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["url_path"] = url_path
        __props__.__dict__["version"] = version
        return SamplingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the sampling rule.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Matches attributes derived from the request.
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter(name="fixedRate")
    def fixed_rate(self) -> pulumi.Output[float]:
        """
        The percentage of matching requests to instrument, after the reservoir is exhausted.
        """
        return pulumi.get(self, "fixed_rate")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[str]:
        """
        Matches the hostname from a request URL.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter(name="httpMethod")
    def http_method(self) -> pulumi.Output[str]:
        """
        Matches the HTTP method of a request.
        """
        return pulumi.get(self, "http_method")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        The priority of the sampling rule.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="reservoirSize")
    def reservoir_size(self) -> pulumi.Output[int]:
        """
        A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
        """
        return pulumi.get(self, "reservoir_size")

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Output[str]:
        """
        Matches the ARN of the AWS resource on which the service runs.
        """
        return pulumi.get(self, "resource_arn")

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the sampling rule.
        """
        return pulumi.get(self, "rule_name")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        Matches the `name` that the service uses to identify itself in segments.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> pulumi.Output[str]:
        """
        Matches the `origin` that the service uses to identify its type in segments.
        """
        return pulumi.get(self, "service_type")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="urlPath")
    def url_path(self) -> pulumi.Output[str]:
        """
        Matches the path from a request URL.
        """
        return pulumi.get(self, "url_path")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        The version of the sampling rule format (`1` )
        """
        return pulumi.get(self, "version")

